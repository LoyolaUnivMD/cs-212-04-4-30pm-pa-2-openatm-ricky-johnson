

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class NewATM {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Create DecimalFormat object
        DecimalFormat currency = new DecimalFormat("$#,##0.00");


        // Introduce program
        System.out.println();
        System.out.println("Welcome to the ATM.");
        System.out.println();

        // Create restart variable so user can go back to beginning of program
        // boolean restart = false;


        // Ask user for first name
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        // Ask user for last name
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        // Ask user for account number
        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();

        // Create accountExists variable
        boolean accountExists = false;

        // Create proceed variable to use in the menu while loop
        boolean proceed = true;

        // Create account objects array
        Account[] accountObjects = new Account[5];


        // Check to see if account already exists
        for (int i = 0; i < accountObjects.length; i++) {
            if (accountObjects[i] != null) {
                if (accountNumber == accountObjects[i].getAccountNumber()) {
                    accountExists = true;   // account exists
                }
                else {
                    accountExists = false;  // account doesn't exist
                }
            }
        }

        // Create new account if account does not exist
        if (!accountExists) {
            for (int i = 0; i < accountObjects.length; i++) {
                if (accountObjects[i] == null) {
                    accountObjects[i] = new Account(firstName, lastName, accountNumber);
                    accountExists = true;
                    break;
                }
            }
        }

        //System.out.println(Arrays.toString(accountObjects));

        // Once we know the account exists, we can access the account and the user can select what they want to do.
        if (accountExists) {
            for (int i = 0; i < accountObjects.length; i++) {
                if (accountObjects[i] != null) {
                    if (accountNumber == accountObjects[i].getAccountNumber()) {

                        // Output welcome message for user
                        System.out.println();   // Spacing
                        accountObjects[i].welcomeUser();
                        // Output user account number
                        System.out.println("Account Number: " + accountObjects[i].getAccountNumber());

                        while (proceed) {
                            // Ask user what they would like to do
                            System.out.println("\nDeposit (1), Withdraw (2), Account Statistics (3), Recent Transactions (4), or Exit (5)?: ");
                            int selection = input.nextInt();

                            if (selection == 1) {
                                System.out.println("//call deposit method");
                            }
                            else if (selection == 2) {
                                // call withdraw method
                            }
                            else if (selection == 3) {
                                // call get statistics method
                            }
                            else if (selection == 4) {
                                // call recent transaction method
                            }
                            else if (selection == 5) {
                                proceed = false;
                            }
                            else {
                                System.out.println("Please enter a valid option.");
                            }
                        }   // End of while loop
                    }
                }
            }
        }




    }
}