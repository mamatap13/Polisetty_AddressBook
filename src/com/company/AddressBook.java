package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 */

public class AddressBook {

    // Global instance of TreeMap
    // Outer key = last name, Inner key = first name
    // Pass Comparator to order keys alphabetically regardless of case
    TreeMap<String, TreeMap<String, AddressEntry>> addressEntryList= new TreeMap<>(Comparator.comparing(String::toLowerCase));

    int numOfTotalEntries = 0;
    int numOfEntries;

    /**
     * Loads entry from user's file, creates an AddressEntry object,
     * and adds the new object to the AddressBook ArrayList
     *
     * @param filename filename string entered by user
     */
    public void readFromFile(String filename) {
        numOfEntries = 0;
        try {
            FileReader fileInput = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            String line;

            //read each line of the user's file
            //add to each corresponding element of a new AddressEntry object
            while ((line = bufferedReader.readLine()) != null) {

                //AddressEntry has 8 elements: first name, last name, street, city, zipcode, phone number, and email
                //first element is the first line of user's file
                //sixth element(zipcode) is converted into an Integer value
                AddressEntry newContact = new AddressEntry(line,       //first name
                        bufferedReader.readLine(),                     //last name
                        bufferedReader.readLine(),                     //street
                        bufferedReader.readLine(),                     //city
                        bufferedReader.readLine(),                     //state
                        Integer.parseInt(bufferedReader.readLine()),   //zip
                        bufferedReader.readLine(),                     //phone number
                        bufferedReader.readLine());                    //email

                //add newContact object to addressEntryList array
                add(newContact);
                numOfEntries++;
            }
            bufferedReader.close();
            fileInput.close();
        }
        //catch exception if entered filename is invalid
        catch(IOException exception) {
            System.out.println("Invalid filename");
        }
        System.out.println("Read in " + numOfEntries + " Addresses, successfully loaded, currently "
                + numOfTotalEntries + " Addresses");

    }

    /**
     * Add entry to the ArrayList addressEntryList
     *
     * @param addressEntry new contact entry
     */
    // add addressEntry to addressEntryList
    public void add(AddressEntry addressEntry){
        // check if lastname exists in addressEntryList
        String lastName = addressEntry.getLastName();


        TreeMap<String, AddressEntry> innerMap = addressEntryList.get(lastName);

        // if key:lastName does not exist
        if (innerMap == null) {
            // create new treemap for that lastName
            innerMap = new TreeMap<>(Comparator.comparing(String::toLowerCase));
            // add new contact (key:firstName, value:contact)
            innerMap.put(addressEntry.getFirstName(), addressEntry);
            // add treemap to outermap [key:lastName, value:(key:firstName, value:contact)]
            addressEntryList.put(addressEntry.getLastName(), innerMap);
            numOfTotalEntries++;

        } else {
            // If key:lastName exists
            // Check if contact exists in innerMap
            AddressEntry existingEntry = innerMap.get(addressEntry.getFirstName());
            // If contact does not exist
            if(existingEntry == null) {
                innerMap.put(addressEntry.getFirstName(), addressEntry);
                numOfTotalEntries++;

            }
        }

    }

    public void remove(String lastName) {

        List<AddressEntry> removalList = find(lastName);
        Map<String, AddressEntry> innerMap = addressEntryList.get(lastName);


        if(removalList.size() == 0) {
            System.out.println("No entries were found with last name: " + lastName);

        } else if(removalList.size() == 1) {
            System.out.println("The following 1 entry was found in the address book.");
            AddressEntry entry = removalList.get(0);
            System.out.println("  " + entry);

            // Ask user y/n to remove, "n" prompts main menu in AddressBookApplication.java
            String YorN = Menu.prompt_YorN();
            while(!YorN.equalsIgnoreCase("n") && !YorN.equalsIgnoreCase("y")) {
                System.out.println("Try Again!");
                YorN = Menu.prompt_YorN();
            }
            if(YorN.equalsIgnoreCase("y")) {
                innerMap.remove(entry.getFirstName());
                System.out.println("You have successfully removed the " + entry.getFirstName() + " "
                        + entry.getLastName() + " contact!");
            }

        } else {
            System.out.println("The following " + removalList.size() + " entries were found in the address book.");
            int i = 1;
            for(AddressEntry addressEntry : innerMap.values()) {
                System.out.println(i + ": " + addressEntry);
                i++;
            }

            int numToRemove = Menu.prompt_Number();

            // Check that numToRemove is valid
            while(numToRemove > removalList.size()) {
                System.out.println("Invalid response");
                numToRemove = Menu.prompt_Number();
            }

            AddressEntry entry = removalList.get(numToRemove - 1);

            innerMap.remove(entry.getFirstName());
            System.out.println("You have successfully removed the " + entry.getFirstName() + " "
                    + entry.getLastName() + " contact!");

        }

    }

    public List<AddressEntry> find(String startOf_lastName) {

        List<AddressEntry> result = new ArrayList<>();
        TreeMap<String, AddressEntry> innerMap = new TreeMap<>();

        // Set of all keys(lastNames)
        Set<String> lastNames = addressEntryList.keySet();
        // For every key in the lastNames set, find key(s) that starts with startOf_lastName
        for(String key : lastNames) {
            if(key.toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                // New map gets values(entries with last names that starts with user input) from addressEntryList
                innerMap = addressEntryList.get(key);

                // Print all entries
                for (AddressEntry addressEntry : innerMap.values()) {
                    result.add(addressEntry);
                }
            }
        }
        return result;

    }
    // print every addressEntry in addressEntryList
    public void list(){
        int i = 1;
        for(TreeMap<String, AddressEntry > lastName : addressEntryList.values() ) {
            for(AddressEntry addressEntry : lastName.values()) {
                System.out.println(i + ": " + addressEntry);
                i++;
            }
        }

    }

}
