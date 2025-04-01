package jattask6;

	public class Account {
	    // Data members
	    private String accountHolderName;
	    private double balance;

	    // Constructor with no arguments
	    public Account() {
	        this.accountHolderName = "Unknown";
	        this.balance = 0.0;
	    }

	    // Constructor with two arguments (account holder name and balance)
	    public Account(String accountHolderName, double balance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    // Method to withdraw money from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds!");
	        }
	    }

	    // Method to check the current balance
	    public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    // Main method to test the Account class
	    public static void main(String[] args) {
	        // Create an Account object using the no-argument constructor
	        Account account1 = new Account();
	        account1.checkBalance();  // Show initial balance

	        // Deposit some money
	        account1.deposit(500.0);
	        account1.checkBalance();  // Show balance after deposit

	        // Withdraw some money
	        account1.withdraw(200.0);
	        account1.checkBalance();  // Show balance after withdrawal

	        // Try withdrawing more than available balance
	        account1.withdraw(400.0);
	        account1.checkBalance();  // Show balance after invalid withdrawal

	        // Create an Account object using the constructor with two arguments
	        Account account2 = new Account("John Doe", 1000.0);
	        account2.checkBalance();  // Show initial balance for account2

	        // Deposit into account2
	        account2.deposit(300.0);
	        account2.checkBalance();  // Show balance after deposit

	        // Withdraw from account2
	        account2.withdraw(500.0);
	        account2.checkBalance();  // Show balance after withdrawal
	    }
	}



