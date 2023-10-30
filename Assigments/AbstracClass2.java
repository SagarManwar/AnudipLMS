package Assigments;

//Abstract class BankAccount
abstract class BankAccount {
 protected String accountNumber;
 protected double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Abstract method to deposit money
 public abstract void deposit(double amount);

 // Abstract method to withdraw money
 public abstract void withdraw(double amount);
}

//Subclass CheckingAccount
class CheckingAccount extends BankAccount {
 public CheckingAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited $" + amount + ". New balance: $" + balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Insufficient funds. Cannot withdraw $" + amount);
     }
 }
}

public class AbstracClass2 {
 public static void main(String[] args) {
     // Create an object of the CheckingAccount class
     CheckingAccount checkingAccount = new CheckingAccount("123456789", 1000.0);

     // Call the "deposit" method
     checkingAccount.deposit(500.0);

     // Call the "withdraw" method
     checkingAccount.withdraw(200.0);
     checkingAccount.withdraw(1500.0); // This should show an insufficient funds message
 }
}
