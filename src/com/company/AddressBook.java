package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 */

public class AddressBook {

    //global instance variable
    ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * loads entry from user's file, creates an AddressEntry object,
     * and adds the new object to the AddressBook ArrayList
     *
     * @param filename filename string entered by user
     */
    public void readFromFile(String filename) {

        try {
            FileReader fileInput = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            String line;

            //read each line of the user's file
            //add to each corresponding element of a new AddressEntry object
            while ((line = bufferedReader.readLine()) != null) {

                //AddressEntry has 7 elements: first name, last name, street, city, zipcode, phone number, and email
                //first element is the first line of user's file
                //sixth element(zipcode) is converted into an Integer value
                AddressEntry newContact = new AddressEntry(line, bufferedReader.readLine(), bufferedReader.readLine(),
                        bufferedReader.readLine(), bufferedReader.readLine(), Integer.valueOf(bufferedReader.readLine()).intValue(),
                        bufferedReader.readLine(), bufferedReader.readLine());

                //add newContact object to addressEntryList array
                add(newContact);
            }
            bufferedReader.close();
            fileInput.close();
        }
        //catch exception if entered filename is invalid
        catch(IOException exception) {
            System.out.println("Invalid filename");
        }
        list();
    }

    // add addressEntry to addressEntryList
    public void add(AddressEntry addressEntry){
        addressEntryList.add(addressEntry);
    }


    // print every addressEntry in addressEntryList
    public void list(){
        for(AddressEntry addressEntry: addressEntryList) {
            System.out.println(addressEntry);
        }
    }

    public void remove(String lastName) {

    }



    public void find(String startOf_lastName) {
        //create new arraylist
        ArrayList<AddressEntry> searchArray = new ArrayList<>();

        //brute-force method: check if every addressEntry starts with the start of user's last name entry
        //if yes, add to new arraylist
        for(AddressEntry addressEntry: addressEntryList) {
            if(addressEntry.getLastName().toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                searchArray.add(addressEntry);
            }
        }

    }

}
