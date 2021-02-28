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

    //global instance variable
    //outer key = last name, inner key = first name
    TreeMap<String, TreeMap<String, AddressEntry>> addressEntryList= new TreeMap<>();

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
            innerMap = new TreeMap<>();
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

    }

    public void find(String startOf_lastName) {

        TreeMap<String, AddressEntry> innerMap = addressEntryList.get(startOf_lastName);
        if(innerMap == null) {
            System.out.println("Address does not exist.");
        }
        else {
            for(AddressEntry addressEntry : innerMap.values()) {
                System.out.println(addressEntry);
            }
        }

    }
    // print every addressEntry in addressEntryList
    public void list(){
        for(TreeMap<String, AddressEntry > lastName : addressEntryList.values() ) {
            for(AddressEntry addressEntry : lastName.values()) {
                System.out.println(addressEntry);
            }
        }

    }

}
