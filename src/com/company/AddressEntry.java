package com.company;
/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 *
 * This class represents a single Address/Contact information entry in the AddressBook
 *
 */
public class AddressEntry {

    //class instance variables representing all the information in an AddressEntry contact
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * empty constructor
     */
    public AddressEntry(){}

    /**
    * accepts a first name, last name, street, city, state, zipcode, phone, and email
    */
    public AddressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
    * @return string with formatted Address entry
    */
    public String toString() {
        return firstName + " " + lastName + "\n  "
                + street + "\n  "
                + city + ", " + state + " " + zip + "\n  "
                + email + "\n  "
                + phone + "\n";
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
