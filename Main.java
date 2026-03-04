class BankAccount {

    // Encapsulation: Private variables
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, int accNo, double initialBalance) {
        accountHolderName = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        BankAccount acc1 = new BankAccount("Maha", 12345, 10000);

        acc1.displayDetails();

        acc1.deposit(2000);
        acc1.withdraw(1500);

        System.out.println("Final Balance: " + acc1.getBalance());
    }
}