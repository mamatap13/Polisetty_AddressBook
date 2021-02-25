package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 */
/
public class AddressBook {

    //global instance variable
    AddressBook addressBook = new AddressBook();
    ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * reads info from user file, creates an AddressEntry object,
     * and adds the new object to the AddressBook ArrayList
     * @param filename filename string entered by user
     */
    /
    public void readFromFile(String filename) {
        try {
            FileReader fileInput = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                AddressEntry newContact = new AddressEntry(line, bufferedReader.readLine(), bufferedReader.readLine(),
                        bufferedReader.readLine(), bufferedReader.readLine(), Integer.valueOf(bufferedReader.readLine()).intValue(),
                        bufferedReader.readLine(), bufferedReader.readLine());
            }
            bufferedReader.close();
            fileInput.close();
        }
        catch(IOException exception) {
            System.out.println(exception);
        }

        addressBook.list();
    }

    // print every addressEntry in addressEntryList
    public void list(){
        for(AddressEntry addressEntry: addressEntryList) {
            System.out.println(addressEntry);
        }
    }

    public void remove(String lastName) {

    }

    // add addressEntry to addressEntryList
    public void add(AddressEntry addressEntry){
        addressEntryList.add(addressEntry);
    }



    public void find(String startOf_lastName) {

    }

}
