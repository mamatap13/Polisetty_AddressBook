package com.company;

/*
*  main AddressBookApplication: purpose is to invoke some methods of the Menu class
* */
public class AddressBookApplication {
    public static void main(String [] args) {

        // instance of AddressBook
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);

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
    public static void initAddressBookExercise(AddressBook ab){

        // instances of AddressEntry
        AddressEntry contact1 = new AddressEntry("Mamata", "Polisetty", "Emerald Isle Lane",
                "CA", "San Jose", 95135, "4082748447", "mpolisetty@horizon.csueastbay.com" );

        AddressEntry contact2 = new AddressEntry("Anuraag", "Polisetty", "11th Court",
                "Sammamish", "WA", 98074, "4082036037", "raja1729@hotmail.com");

        // add contacts to AddressBook instance ab
        ab.add(contact1);
        ab.add(contact2);

        // list addressEntrys in addressEntryList
        ab.list();
    }
}





