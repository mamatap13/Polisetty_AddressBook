package com.company;

import java.util.ArrayList;
public class AddressBook {

    ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    // print every addressEntry in addressEntryList
    public void list(){
        for(AddressEntry addressEntry: addressEntryList) {
            System.out.println(addressEntry);
        }
    }

    // add addressEntry to addressEntryList
    public void add(AddressEntry addressEntry){
        addressEntryList.add(addressEntry);
    }

}
