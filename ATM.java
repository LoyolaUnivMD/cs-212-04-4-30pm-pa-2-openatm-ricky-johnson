//pa1

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ATM {
    public static void main(String[] args){

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Create DecimalFormat object
        DecimalFormat currency = new DecimalFormat("$#,##0.00");

        // Introduce program
        System.out.println();
        System.out.println("Welcome to the ATM.");
        System.out.println();

        // Ask user for first name
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        // Ask user for last name
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        // Ask user for account number
        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        // Error check for input of 0. 0 is default value for accountNumbers array below.
        while (accountNumber <= 0) {
            System.out.println("\nAccount number must be a number larger than 0 and a whole number (no decimals).");
            System.out.println("Enter account number: ");
            accountNumber = input.nextInt();
        }


        // Instantiate array of account numbers
        int[] accountNumbers = new int[5];
        // Instantiate array of account objects
        Account[] accountObjects = new Account[5];

        // for loop to check if user entered account number exists
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] == 0) {   // 0 is default value. Any index with 0 is space for a new account.
                accountNumbers[i] = accountNumber;  // index of accountNumbers becomes user entered account number
                System.out.println("Account Number: " + accountNumber); // display user's account number
                break;  // break loop so other indexes with 0 are not replaced
            }
        }

        // For loop to add new account object to accountObjects. Index of accountObjects corresponds with index of accountNumbers.
        for (int j = 0; j < accountObjects.length; j++) {
            if (accountObjects[j] == null) {
                accountObjects[j] = new Account(firstName, lastName, accountNumber);
                //Account name = new Account(firstName, lastName, accountNumber);
                break;  // // break loop so other indexes with null are not replaced
            }
        }

        //System.out.println(Arrays.toString(accountObjects));


        for (int i = 0; i < accountObjects.length; i++) {
            if (accountNumber == accountObjects[i].getAccountNumber()) {
                //System.out.println("working");
                //break;

                // Ask user for menu selection
                System.out.println("Deposit (d), Withdraw (w), Account Statistics (as) , or Leave (l)?: ");
                String selection = input.nextLine();
                selection = selection.toLowerCase();

                // While loop to make menu work
                while (!selection.equals("l")) {
                    if (selection.equals("d")) {
                        System.out.println("working");
                    }

                }
            }

        }







    } // end of main method

} // end of ATM class
