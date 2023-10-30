package Assigments;

//Define the BankAC interface
interface BankAC {
 void deposit(double amount);
 void withdraw(double amount);
}

//Implement the BankAC interface in the checkAccount class
class checkAccount implements BankAC {
 private double balance;

 public checkAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
     } else if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
     } else {
         System.out.println("Insufficient funds. Cannot withdraw $" + amount);
     }
 }
}

public class AbstracClass3 {
 public static void main(String[] args) {
     // Create an object of the checkAccount class
     checkAccount checkAcount = new checkAccount(1000.0);

     // Call the "deposit" method
     checkAcount.deposit(500.0);

     // Call the "withdraw" method
     checkAcount.withdraw(200.0);
     checkAcount.withdraw(1500.0); // This should show an insufficient funds message
 }
}

