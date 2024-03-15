public class Account {

    // Data Members
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;
    private String[] transactionTypes;
    private double[] transactionValues;


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
        this.transactionTypes = new String[5];
        this.transactionValues = new double[5];
    }   // End of Default Constructor


    // Methods
    //public boolean isOwner(String name) {
        //if
   // }

    // getAccountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    public void welcomeUser() {
        System.out.println("Welcome, " + firstName + " " + lastName + ".");
    }






}
