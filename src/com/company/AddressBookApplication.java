package com.company;
import java.io.*;
import java.util.Scanner;
/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 *
 * purpose is to invoke some methods of the Menu class
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
                case 1:
                    String filename = Menu.prompt_FileName();
                    ab.readFromFile(filename);
                    break;

                case 2:
                    AddressEntry newContact = new AddressEntry(Menu.prompt_FirstName(), Menu.prompt_LastName(),
                                                Menu.prompt_Street(), Menu.prompt_City(), Menu.prompt_State(),
                                                Menu.prompt_Zip(), Menu.prompt_Telephone(), Menu.prompt_Email());
                    ab.add(newContact);

                    break;
                case 3:
                    //ab.remove();
                    break;
                case 4:
                   // ab.find();
                    break;
                case 5:
                    ab.list();
                    break;
                default:
                    //invalid response
                    System.out.println("Try again!");
            }
            userChoice = Menu.prompt_Menu();
        }
        //print if user quits(enters 6)
        System.out.println("Goodbye!");


        //initAddressBookExercise(ab);
        //init("AddressInputDataFile.txt");

       // ab.list();
        //simply invokes static methods of the Menu class
        //Menu.prompt_FirstName();
        //Menu.prompt_LastName();
        //Menu.prompt_Street();
        //Menu.prompt_City();
        //Menu.prompt_State();
        //Menu.prompt_Zip();
        //Menu.prompt_Telephone();
        //Menu.prompt_Email();
    }

//    public static void init(String filename) throws IOException {
//
//        FileReader file_input = new FileReader(filename);
//
//        BufferedReader BR = new BufferedReader(file_input);
//        String line;
//        while((line = BR.readLine()) != null) {
//            AddressEntry newContact = new AddressEntry(line, BR.readLine(), BR.readLine(), BR.readLine(),
//                    BR.readLine(), Integer.valueOf(BR.readLine()).intValue(), BR.readLine(), BR.readLine());
//            ab.add(newContact);
//        }
//
//        BR.close();
//        file_input.close();
//
//        ab.list();
//    }
//    public static void initAddressBookExercise(AddressBook ab){
//
//        // instances of AddressEntry
//        AddressEntry contact1 = new AddressEntry("Mamata", "Polisetty", "Emerald Isle Lane",
//                "CA", "San Jose", 95135, "4082748447", "mpolisetty@horizon.csueastbay.com" );
//
//        AddressEntry contact2 = new AddressEntry("Anuraag", "Polisetty", "11th Court",
//                "Sammamish", "WA", 98074, "4082036037", "raja1729@hotmail.com");
//
//        // add contacts to AddressBook instance ab
//        ab.add(contact1);
//        ab.add(contact2);
//
//        // list addressEntrys in addressEntryList
//       // ab.list();
//    }
}





