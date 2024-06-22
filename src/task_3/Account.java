package task_3;

public class Account {
    
    // data member
    private double balance;
    private int accountNumber;
    
    // Constructor with no arguments
    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }
    
    // Constructor with two arguments
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }
    
  
   public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
    
       // Main method
      public static void main(String[] args) {
        // Creating an account with no arguments
        Account account1 = new Account();
        System.out.println(account1);
        
        // Creating an account with account number and initial balance
        Account account2 = new Account(123456789, 1000.0);
        System.out.println(account2);
        
        // Depositing money
        account2.deposit(500);
        
        // Withdrawing money
        account2.withdraw(300.0);
        
        // Trying to withdraw more than the balance
        account2.withdraw(1500.0);
    }
}
