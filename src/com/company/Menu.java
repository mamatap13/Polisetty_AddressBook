package com.company;
import java.io.IOException;
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
        System.out.print("First Name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Last Name to be entered
     * @return user's string input for Last Name
     */
    public static String prompt_LastName(){
        System.out.print("Last Name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Street to be entered
     * @return user's string input for Street
     */
    public static String prompt_Street() {
        System.out.print("Street: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the City to be entered
     * @return user's string input for City
     */
    public static String prompt_City(){
        System.out.print("City: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the State to be entered
     * @return user's string input for State
     */
    public static String prompt_State() {
        System.out.print("State: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Zip to be entered
     * @return user's int input for Zip
     */
    public static int prompt_Zip(){
        System.out.print("Zip: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * generates a standard output prompt for the Telephone to be entered
     * @return user's string input for Telephone
     */
    public static String prompt_Telephone() {
        System.out.print("Telephone[000-000-0000]: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Email to be entered
     * @return user's string input for email
     */
    public static String prompt_Email(){
        System.out.print("Email: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Filename to be entered
     * @return user's string input for filename
     */
    public static String prompt_FileName(){
        System.out.println("Enter the filename: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for the Last Name for removal to be entered
     * @return user's string input for last name of contact to remove
     */
    public static String prompt_Removal(){
        System.out.println("Enter the last name of the contact to remove: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for start of the Last Name to be entered
     * @return user's string input for last name of contact to find
     */
    public static String prompt_Find(){
        System.out.println("Enter in all or the start of the Last Name of the contact to find: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    /**
     * generates a standard output prompt for a Number to be entered
     * @return user's integer input for number of entry to remove
     */
    public static int prompt_Number(){
        System.out.println("Select number of the entry you wish to remove: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * generates a standard output prompt for a 'y' or 'n' to be entered
     * @return user's string input for a 'y' or 'n'
     */
    public static String prompt_YorN(){
        System.out.println("Hit 'y' to remove or 'n' to return to the main menu." );
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


}
