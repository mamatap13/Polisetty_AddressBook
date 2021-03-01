package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * This class tests the AddressEntry class
 *
 * @author Mamata Polisetty
 * @since 2021-02-24
 */
public class AddressEntryTest {

    /**
     * 1st test for toString()
     */
    @Test
    public void test1ToString() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Street", "Fremont",
                "Ca", 94555, "123-456-7899", "n/a");
        assertEquals("John Doe\n  123 Street\n  Fremont, Ca 94555\n  n/a\n  123-456-7899\n", entry.toString());
    }

    /**
     * 2nd test for toString()
     */
    @Test
    public void test2ToString() {
        AddressEntry entry = new AddressEntry("Jane", "Doe", "123 Street", "Fremont",
                "Ca", 94555, "123-000-7009", "n/a");
        assertEquals("Jane Doe\n  123 Street\n  Fremont, Ca 94555\n  n/a\n  123-000-7009\n", entry.toString());
    }

    /**
     * 1st test for getFirstName()
     */
    @Test
    public void getFirstNameTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Mamata", entry.getFirstName());
    }

    /**
     * 2nd test for getFirstName()
     */
    @Test
    public void getFirstNameTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Anuraag", entry.getFirstName());
    }

    /**
     * 1st test for setFirstName()
     */
    @Test
    public void setFirstNameTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setFirstName("Joe");
        assertEquals("Joe", entry.getFirstName());
    }

    /**
     * 2nd test for setFirstName()
     */
    @Test
    public void setFirstNameTest2() {
        AddressEntry entry = new AddressEntry();
        entry.setFirstName("Jill");
        assertEquals("Jill", entry.getFirstName());
    }

    /**
     * 1st test for getLastName()
     */
    @Test
    public void getLastNameTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Polisetty", entry.getLastName());
    }

    /**
     * 2nd test for getLastName()
     */
    @Test
    public void getLastNameTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Polisetty", entry.getLastName());
    }

    /**
     * 1st test for setLastName()
     */
    @Test
    public void setLastNameTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setLastName("Biden");
        assertEquals("Biden", entry.getLastName());
    }

    /**
     * 2nd test for setLastName()
     */
    @Test
    public void setLastNameTest2() {
        AddressEntry entry = new AddressEntry();
        entry.setLastName("Biden");
        assertEquals("Biden", entry.getLastName());
    }

    /**
     * 1st test for getStreet()
     */
    @Test
    public void getStreetTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("11th Ct", entry.getStreet());
    }

    /**
     * 2nd test for getStreet()
     */
    @Test
    public void getStreetTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "5107 Slick Horn Way",
                "Sammamish", "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("5107 Slick Horn Way", entry.getStreet());
    }

    /**
     * 1st test for setStreet()
     */
    @Test
    public void setStreetTest1() {
        AddressEntry entry = new AddressEntry();
        String street = "Pennsylvania Ave";
        entry.setStreet(street);
        assertEquals("Pennsylvania Ave", entry.getStreet());
    }

    /**
     * 2nd test for setStreet()
     */
    @Test
    public void setStreetTest2() {
        AddressEntry entry = new AddressEntry();
        String street = "Delaware St";
        entry.setStreet(street);
        assertEquals("Delaware St", entry.getStreet());
    }

    /**
     * 1st test for getCity()
     */
    @Test
    public void getCityTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Sammamish", entry.getCity());
    }

    /**
     * 2nd test for getCity()
     */
    @Test
    public void getCityTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Fremont",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("Fremont", entry.getCity());
    }

    /**
     * 1st test for setCity()
     */
    @Test
    public void setCityTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setCity("Washington D.C");
        assertEquals("Washington D.C", entry.getCity());
    }

    /**
     * 2nd test for setCity()
     */
    @Test
    public void setCityTest2() {
        AddressEntry entry = new AddressEntry();
        String city = "San Francisco";
        entry.setCity(city);
        assertEquals("San Francisco", entry.getCity());
    }

    /**
     * 1st test for getState()
     */
    @Test
    public void getStateTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("WA", entry.getState());
    }

    /**
     * 2nd test for getState()
     */
    @Test
    public void getStateTest2() {
        AddressEntry entry = new AddressEntry("Anuraage", "Polisetty", "5107 Slick Horn WAy",
                "Fremont", "CA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("CA", entry.getState());
    }

    /**
     * 1st test for setState()
     */
    @Test
    public void setStateTest1() {
        AddressEntry entry = new AddressEntry();
        String state = "MD";
        entry.setState(state);
        assertEquals("MD", entry.getState());
    }

    /**
     * 2nd test for setState()
     */
    @Test
    public void setStateTest2() {
        AddressEntry entry = new AddressEntry();
        String state = "DE";
        entry.setState(state);
        assertEquals("DE", entry.getState());
    }

    /**
     * 1st test for getZip()
     */
    @Test
    public void getZipTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals(98074, entry.getZip());
    }

    /**
     * 2nd test for getZip()
     */
    @Test
    public void getZipTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "Emerald Isle Ln",
                "San Jose", "CA", 95135, "123-456-7890", "n/a");
        assertEquals(95135, entry.getZip());
    }

    /**
     * 1st test for setZip()
     */
    @Test
    public void setZipTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setZip(01010);
        assertEquals(01010, entry.getZip());
    }

    /**
     * 2nd test for setZip()
     */
    @Test
    public void setZipTest2() {
        AddressEntry entry = new AddressEntry();
        entry.setZip(56032);
        assertEquals(56032, entry.getZip());
    }

    /**
     * 1st test for getPhone()
     */
    @Test
    public void getPhoneTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("123-456-7890", entry.getPhone());
    }

    /**
     * 2nd test for getPhone()
     */
    @Test
    public void getPhoneTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Fremont",
                "CA", 98074, "888-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("888-456-7890", entry.getPhone());
    }

    /**
     * 1st test for setPhone()
     */
    @Test
    public void setPhoneTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setPhone("100-100-1001");
        assertEquals("100-100-1001", entry.getPhone());
    }

    /**
     * 2nd test for setPhone()
     */
    @Test
    public void setPhoneTest2() {
        AddressEntry entry = new AddressEntry();
        entry.setPhone("425-188-3001");
        assertEquals("425-188-3001", entry.getPhone());
    }

    /**
     * 1st test for getEmail()
     */
    @Test
    public void getEmailTest1() {
        AddressEntry entry = new AddressEntry("Mamata", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "mpolisetty@horizon.csueastbay.edu");
        assertEquals("mpolisetty@horizon.csueastbay.edu", entry.getEmail());
    }

    /**
     * 2nd test for getEmail()
     */
    @Test
    public void getEmailTest2() {
        AddressEntry entry = new AddressEntry("Anuraag", "Polisetty", "11th Ct", "Sammamish",
                "WA", 98074, "123-456-7890", "email@email.com");
        assertEquals("email@email.com", entry.getEmail());
    }

    /**
     * 1st test for setEmail()
     */
    @Test
    public void setEmailTest1() {
        AddressEntry entry = new AddressEntry();
        entry.setEmail("hotmail@hotmail.com");
        assertEquals("hotmail@hotmail.com", entry.getEmail());
    }

    /**
     * 2nd test for setEmail()
     */
    @Test
    public void setEmailTest2() {
        AddressEntry entry = new AddressEntry();
        entry.setEmail("yahoo123@hotmail.com");
        assertEquals("yahoo123@hotmail.com", entry.getEmail());
    }
}