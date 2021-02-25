package com.company;
import java.io.*;
import java.util.Scanner;
/**
 * @author Mamata Polisetty
 * @since 2021-16-02
 *
 * contains static methods to prompt to standard output information about a Contact like name, etc.
 */
public class Menu {


    public static int prompt_Menu() {
        System.out.println("**************************************");
        System.out.println("Please enter the number for your menu selection: ");
        System.out.println("1 = Loading From File");
        System.out.println("2 = Addition");
        System.out.println("3 = Removal");
        System.out.println("4 = Find");
        System.out.println("5 = Listing");
        System.out.println("6 = Quit");
        System.out.println("**************************************");

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();
        return userChoice;
    }

    /**
     * generates a standard output prompt for the First Name to be entered
     */
    public static void prompt_FirstName() {
        System.out.println("First Name: ");
    }

    /**
     * generates a standard output prompt for the Last Name to be entered
     */
    public static void prompt_LastName(){
        System.out.println("Last Name: ");
    }

    /**
     * generates a standard output prompt for the Street to be entered
     */
    public static void prompt_Street() {
        System.out.println("Street: ");
    }

    /**
     * generates a standard output prompt for the City to be entered
     */
    public static void prompt_City(){
        System.out.println("City: ");
    }

    /**
     * generates a standard output prompt for the State to be entered
     */
    public static void prompt_State() {
        System.out.println("State: ");
    }

    /**
     * generates a standard output prompt for the Zip to be entered
     */
    public static void prompt_Zip(){
        System.out.println("Zip: ");
    }

    /**
     * generates a standard output prompt for the Telephone to be entered
     */
    public static void prompt_Telephone() {
        System.out.println("First Name: ");
    }

    /**
     * generates a standard output prompt for the Email to be entered
     */
    public static void prompt_Email(){
        System.out.println("Email: ");
    }
}
