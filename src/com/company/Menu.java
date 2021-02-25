package com.company;
import java.util.Scanner;
/**
 * @author Mamata Polisetty
 * @since 2021-02-24
 *
 * contains static methods to prompt to standard output information about a Contact like name, etc.
 */
public class Menu {




    public static int prompt_Menu() {
        System.out.println("*************************************************");
        System.out.println("Please enter the number for your menu selection: ");
        System.out.println("1 = Loading From File");
        System.out.println("2 = Addition");
        System.out.println("3 = Removal");
        System.out.println("4 = Find");
        System.out.println("5 = Listing");
        System.out.println("6 = Quit");
        System.out.println("*************************************************");

        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * generates a standard output prompt for the First Name to be entered
     * @return user's string input for First Name
     */
    public static String prompt_FirstName() {
        System.out.println("First Name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Last Name to be entered
     * @return user's string input for Last Name
     */
    public static String prompt_LastName(){
        System.out.println("Last Name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Street to be entered
     * @return user's string input for Street
     */
    public static String prompt_Street() {
        System.out.println("Street: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the City to be entered
     * @return user's string input for City
     */
    public static String prompt_City(){
        System.out.println("City: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the State to be entered
     * @return user's string input for State
     */
    public static String prompt_State() {
        System.out.println("State: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Zip to be entered
     * @return user's int input for Zip
     */
    public static int prompt_Zip(){
        System.out.println("Zip: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * generates a standard output prompt for the Telephone to be entered
     * @return user's string input for Telephone
     */
    public static String prompt_Telephone() {
        System.out.println("First Name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Email to be entered
     * @return user's string input for email
     */
    public static String prompt_Email(){
        System.out.println("Email: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
