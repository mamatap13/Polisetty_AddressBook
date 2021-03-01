package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 *
 * This class represents and contains a possibly ever growing and/or shrinking "list" of AddressEntries.
 * It contains various methods: readFromFile(filename), add(addressEntry), remove(lastName), find(startOf_lastName), list()
 *
 */
public class AddressBook {

    // Global instance of TreeMap
    // Outer key = last name, Inner key = first name
    // Pass Comparator to order keys alphabetically regardless of case
    TreeMap<String, TreeMap<String, AddressEntry>> addressEntryList= new TreeMap<>(Comparator.comparing(String::toLowerCase));

    int numOfTotalEntries = 0;
    int numOfEntries;

    /**
     * Loads entry from user's file, creates an AddressEntry object for each new contact,
     * and adds the new object to the AddressBook TreeMap
     *
     * @param filename filename string entered by user
     */
    public void readFromFile(String filename) {
        numOfEntries = 0;
        try {
            FileReader fileInput = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            String line;

            // Read each line of the user's file
            // Add to each corresponding element of a new AddressEntry object
            while ((line = bufferedReader.readLine()) != null) {

                // AddressEntry has 8 elements: first name, last name, street, city, zipcode, phone number, and email
                // First element is the first line of user's file
                // Sixth element(zipcode) is converted into an Integer value
                AddressEntry newContact = new AddressEntry(line,       //first name
                        bufferedReader.readLine(),                     //last name
                        bufferedReader.readLine(),                     //street
                        bufferedReader.readLine(),                     //city
                        bufferedReader.readLine(),                     //state
                        Integer.parseInt(bufferedReader.readLine()),   //zip
                        bufferedReader.readLine(),                     //phone
                        bufferedReader.readLine());                    //email

                // Add newContact object to addressEntryList
                add(newContact);
                numOfEntries++;
            }
            bufferedReader.close();
            fileInput.close();
        }
        // Catch exception if entered filename is invalid
        catch(IOException exception) {
            System.out.println("Invalid filename");
        }
        System.out.println("Read in " + numOfEntries + " Addresses, successfully loaded, currently "
                + numOfTotalEntries + " Addresses");

    }

    /**
     * Add entry to addressEntryList
     *
     * @param addressEntry new contact entry
     */
    public void add(AddressEntry addressEntry){
        // Check if lastname exists in addressEntryList
        String lastName = addressEntry.getLastName();

        // New TreeMap represents values of addressEntryList
        TreeMap<String, AddressEntry> innerMap = addressEntryList.get(lastName);

        // If key:lastName does not exist
        if (innerMap == null) {
            // Create new treemap for that lastName
            innerMap = new TreeMap<>(Comparator.comparing(String::toLowerCase));
            // Add new contact (key:firstName, value:contact)
            innerMap.put(addressEntry.getFirstName(), addressEntry);
            // Add treemap to outermap [key:lastName, value:(key:firstName, value:contact)]
            addressEntryList.put(addressEntry.getLastName(), innerMap);
            numOfTotalEntries++;

        } else {
            // If key:lastName exists
            // Check if contact exists in innerMap
            AddressEntry existingEntry = innerMap.get(addressEntry.getFirstName());
            // If contact does not exist, add new contact to innerMap
            if(existingEntry == null) {
                innerMap.put(addressEntry.getFirstName(), addressEntry);
                numOfTotalEntries++;

            }
        }

    }

    /**
     * Removes entry from addressEntryList
     *
     * @param lastName last name of contact to remove
     */
    public void remove(String lastName) {

        // New list made up of address entries with the same last name
        List<AddressEntry> removalList = find(lastName);
        // New Map made up of address entries with the same last name
        Map<String, AddressEntry> innerMap = addressEntryList.get(lastName);

        // If removalList is empty
        if(removalList.size() == 0) {
            System.out.println("No entries were found with last name: " + lastName);

        } else if(removalList.size() == 1) { // If removalList has 1 entry only

            System.out.println("The following 1 entry was found in the address book.");
            // Place zeroth element (only element) into a new address entry object
            AddressEntry entry = removalList.get(0);
            // Print entry
            System.out.println("  " + entry);

            // Ask user yes/no to remove, "n" prompts main menu in AddressBookApplication.java
            String YorN = Menu.prompt_YorN();
            // If user enters an invalid response
            while(!YorN.equalsIgnoreCase("n") && !YorN.equalsIgnoreCase("y")) {
                System.out.println("Try Again!");
                YorN = Menu.prompt_YorN();
            }
            // Go thru with removal if user enters "y"
            if(YorN.equalsIgnoreCase("y")) {
                innerMap.remove(entry.getFirstName());
                System.out.println("You have successfully removed the " + entry.getFirstName() + " "
                        + entry.getLastName() + " contact!");
            }

        } else { // If removalList has more than 1 entry
            System.out.println("The following " + removalList.size() + " entries were found in the address book.");
            int i = 1;
            // Print all entries
            for(AddressEntry addressEntry : innerMap.values()) {
                System.out.println(i + ": " + addressEntry);
                i++;
            }

            // Prompt user to choose which entry to remove
            int numToRemove = Menu.prompt_Number();

            // Check that numToRemove is valid
            while(numToRemove > removalList.size()) {
                System.out.println("Invalid response");
                numToRemove = Menu.prompt_Number();
            }

            // Place chosen address into new addressEntry object
            AddressEntry entry = removalList.get(numToRemove - 1);

            // Remove entry
            innerMap.remove(entry.getFirstName());
            System.out.println("You have successfully removed the " + entry.getFirstName() + " "
                    + entry.getLastName() + " contact!");

        }

    }

    /**
     * Finds entry from addressEntryList
     *
     * @param startOf_lastName start of last name of contact to find
     */
    public List<AddressEntry> find(String startOf_lastName) {

        // New list and map to store found entries
        List<AddressEntry> result = new ArrayList<>();
        TreeMap<String, AddressEntry> innerMap;

        // Set of all keys(lastNames)
        Set<String> lastNames = addressEntryList.keySet();
        // For every key in the lastNames set, find key(s) that starts with startOf_lastName
        for(String key : lastNames) {
            if(key.toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                // New map gets values(entries with last names that starts with user input) from addressEntryList
                innerMap = addressEntryList.get(key);

                // Print all entries
                result.addAll(innerMap.values());
            }
        }
        return result;

    }
    /**
     * List all entries from addressEntryList
     */
    public void list(){
        int i = 1;
        // Print all entries, numbered
        for(TreeMap<String, AddressEntry> lastName : addressEntryList.values() ) {
            for(AddressEntry addressEntry : lastName.values()) {
                System.out.println(i + ": " + addressEntry);
                i++;
            }
        }
        // Print total number of addresses (i - 1 = count of entries)
        System.out.println("Currently " + (i - 1) + " entries in the Address Book.");
    }

}
