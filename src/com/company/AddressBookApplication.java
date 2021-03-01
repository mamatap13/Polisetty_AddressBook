package com.company;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 *
 * This class is used to display menu option to the user.
 * Includes:
 *    1 = Loading
 *    2 = Addition
 *    3 = Removal
 *    4 = Find
 *    5 = Listing
 *    6 = Quit
 */
public class AddressBookApplication {

    //global variable


    public static void main(String [] args) throws IOException{
        AddressBook ab = new AddressBook();

        Scanner userInput = new Scanner(System.in);
        //stores prompt_Menu response from user
        int userChoice = Menu.prompt_Menu();

        //while user does not quit(enters 6), keep calling prompt_Menu
        while(userChoice != 6) {
            switch(userChoice) {
                case 1: //1. Load from file
                    //Prompt user for file name
                    String filename = Menu.prompt_FileName();
                    //Call method to read and load contacts into AddressBook ab
                    ab.readFromFile(filename);
                    break;

                case 2: //2. Addition
                    //Create new contact constructor and add to AddressBook ab
                    AddressEntry newContact = new AddressEntry(Menu.prompt_FirstName(),
                            Menu.prompt_LastName(),
                            Menu.prompt_Street(),
                            Menu.prompt_City(),
                            Menu.prompt_State(),
                            Menu.prompt_Zip(),
                            Menu.prompt_Telephone(),
                            Menu.prompt_Email());
                    ab.add(newContact);

                    break;
                case 3: // 3. Removal
                    //Prompt user for last name of contact to remove
                    String lastName = Menu.prompt_Removal();
                    ab.remove(lastName);

                    break;

                case 4: // 4. Find
                    String startOf_LastName = Menu.prompt_Find();

                    // Find method returns a list of address entries
                    List<AddressEntry> entryList = ab.find(startOf_LastName);

                    // If list is empty, print "no entries found"
                    // Else, print address entries (numbered)
                    if(entryList.size() == 0) {
                        System.out.println("No entries were found with last name starting with: " + startOf_LastName);
                    } else {
                        System.out.println("The following were found in the address book for the last name starting with " +
                                startOf_LastName);
                        int i = 1;
                        for(AddressEntry entry : entryList) {
                            System.out.println(i + ": " + entry);
                            i++;
                        }
                    }
                    break;

                case 5: // 5. Listing
                    //List all contacts in AddressBook ab
                    ab.list();
                    break;

                default:
                    //invalid response
                    System.out.println("Try again!");
            }
            userChoice = Menu.prompt_Menu();
        }
        // 6. Quit
        System.out.println("Goodbye!");

    }
}





