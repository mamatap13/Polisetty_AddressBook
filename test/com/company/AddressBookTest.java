package com.company;

import org.junit.Test;

import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;
/**
 * This class tests the AddressBookTest class
 *
 * @author Mamata Polisetty
 * @since 2021-02-24
 */
public class AddressBookTest {

    /**
     * 1st test for readFromFile()
     */
    @Test
    public void readFromFileTest1() {
        AddressBook addressBook = new AddressBook();
        addressBook.readFromFile("AddressInputDataFile.txt");

        assertEquals(5, addressBook.numOfTotalEntries);
    }

    /**
     * 2nd test for readFromFile()
     */
    @Test
    public void readFromFileTest2() {
        AddressBook addressBook = new AddressBook();
        addressBook.readFromFile("AddressInputDataFile.txt");

        List<AddressEntry> result = addressBook.find("grew");
        assertEquals(2, result.size());
    }

    /**
     * 1st test for add()
     */
    @Test
    public void addTest1() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry);
        List<AddressEntry> result = addressBook.find("Polisetty");
        assertEquals(1, result.size());
    }

    /**
     * 2nd test for add()
     */
    @Test
    public void addTest2() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        AddressEntry entry2 = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Fremont",
                "CA", 94555, "123-456-7890", "anuraag@polisetty.com");
        addressBook.add(entry1);
        addressBook.add(entry2);
        List<AddressEntry> result = addressBook.find("Polisetty");
        assertEquals(2, result.size());
    }

    /**
     * 1st test for remove()
     */
    @Test
    public void remove() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry);
        addressBook.remove("Polisetty");

        List<AddressEntry> result = addressBook.find("Polisetty");

        assertEquals(0, result.size());
    }

    /**
     * 1st test for find()
     */
    @Test
    public void findTest1() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry);
        List<AddressEntry> result = addressBook.find("Polisetty");
        assertEquals(1, result.size());
    }

    /**
     * 2nd test for find()
     */
    @Test
    public void findTest2() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        AddressEntry entry2 = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry1);
        addressBook.add(entry2);
        List<AddressEntry> result = addressBook.find("Polisetty");
        assertEquals(2, result.size());
    }
    @Test
    public void list() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry);

        assertEquals(1, addressBook.numOfTotalEntries);
    }

    @Test
    public void listTest2() {
        AddressBook addressBook = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        AddressEntry entry2 = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        addressBook.add(entry1);
        addressBook.add(entry2);

        assertEquals(2, addressBook.numOfTotalEntries);
    }
}