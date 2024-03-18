import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {

    // Scanner object
    Scanner input = new Scanner(System.in);

    // DecimalFormat object
    DecimalFormat currency = new DecimalFormat("$#,##0.00");

    // Data Members
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;
    private String transactionTypes;
    private  ArrayList<Double> transactionValues;
    private double depositValue;
    private double withdrawValue;
    private String withdrawType;

    // General Constructor
    public Account(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }   // End of General Constructor

    // Default Constructor
    public Account() {
        // Default Values
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.accountNumber = 0;
        this.balance = 0;
        this.depositValue = 0;
        this.withdrawValue = 0;
        this.withdrawType = "Withdraw";
        this.transactionTypes = "None";
    }   // End of Default Constructor


    // Methods

    // getAccountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Welcome user when their account is verified
    public void welcomeUser() {
        System.out.println("Welcome, " + firstName + " " + lastName + ".");
    }


    // Deposit Methods //
    // Deposit Calculation
    public double depositCalculation() {
        balance = balance + depositValue;
        return balance;
    } // End of depositCalculation method

    // Error check for negative deposit
    public double checkDepositValue() {
        while (depositValue <= 0) {
            System.out.println("\nYou must deposit at least $0.01");
            System.out.println("Enter deposit amount: ");
            depositValue = input.nextDouble();
        }
        return depositValue;
    } // End of checkDepositValue method

    // Deposit
    public double deposit() {
        // Ask user for deposit amount
        System.out.println("\nEnter deposit amount: ");
        depositValue = input.nextDouble();

        // Error check for negative deposit
        checkDepositValue();

        // Update balance with new deposit value
        depositCalculation();


        // Print updated balance after deposit with currency formatting
        System.out.println("\nYour new balance is: " + currency.format(balance));
        System.out.println("---------------------------------------------------------------------------------");

        return depositValue; // need for transaction values
    } // End of deposit method


    // Withdraw Methods //
    // Withdraw Calculation
    public double withdrawCalculation() {
        balance = balance - withdrawValue;
        return balance;
    } // End of withdrawCalculation method

    // Error Check for negative withdraw
    public double checkNegativeWithdraw() {
        while (withdrawValue <= 0) {
            System.out.println("\nYou must withdraw at least $0.01");
            System.out.println("Enter withdraw amount: ");
            withdrawValue = input.nextDouble();
        }
        return withdrawValue;
    } // End of checkNegativeWithdraw method

    // Check for sufficient balance
    public void checkSufficientBalance() {
        while (withdrawValue > balance) {
            System.out.println("\nInsufficient funds. You cannot withdraw more than what is in your account.");
            System.out.println("Your current balance: " + currency.format(balance));
            System.out.println("Enter withdraw amount: ");
            withdrawValue = input.nextDouble();
        }
    } // End of checkSufficientBalance method

    // Withdraw
    public double withdraw() {
        // Ask user for withdraw amount
        System.out.println("\nEnter withdraw amount: ");
        withdrawValue = input.nextDouble();

        // Error check for a negative withdraw value
        checkNegativeWithdraw();

        // Inform user of 5% charge for overdraw
        checkSufficientBalance();

        // Withdraw Calculation
        withdrawCalculation();

        // Print updated balance after withdrawal with currency formatting
        System.out.println("\nYour new balance is: " + currency.format(balance));
        System.out.println("---------------------------------------------------------------------------------");

        // Add withdraw to transactionTypes
        //addToTransactionTypes();

        return withdrawValue;
    } // End of withdraw method


    // addToTransactionTypes
    public void addToTransactionTypes() {
       // transactionTypes.add("Withdraw");
        //return transactionTypes;
    }

    // getStats
    public void getStats() {
        System.out.println("Your current balance: " + currency.format(balance));
        System.out.println(transactionTypes);

    }


    // recentTransactions





}
