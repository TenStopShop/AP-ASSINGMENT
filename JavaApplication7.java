
package JavaApplication7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaApplication7 {
 static String persdetails;
    static int idno, accnumber = 1324566;
    static double balance = 12000;
    static List<String> transactionHistory = new ArrayList<>();

    static void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to GLS Bank");
        System.out.println("Please go ahead and provide us with your name and surname");
        persdetails = scanner.nextLine();
        System.out.println("Insert residential Address");
        persdetails = scanner.nextLine();
        System.out.println("Insert Idnumber");
        idno = scanner.nextInt();
        System.out.println(accnumber);
        System.out.println("The acc holder name and surname: " + persdetails);
        System.out.println("The acc holder balance is: " + balance);
    }

    static void deposits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the deposition");
        System.out.print("Please enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        System.out.println("You have deposited R" + amount + " successfully!");
        transactionHistory.add("Deposit: R" + amount);
        balance += amount;
    }

    static void withdrawals() {
        Scanner scanner = new Scanner(System.in);
      boolean validResponse = false;

        while (!validResponse) {
            System.out.print("Would you like to withdraw your money? (Yes/No): ");
            String response = scanner.nextLine();

            if (response.equals("Yes")) {
                System.out.println("You may withdraw.");
                validResponse = true;
            } else if (response.equals("No")) {
                System.out.println("Thank you for using GLS services.");
                validResponse = false;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'No'.");
                scanner.close();
            }
          

     scanner.nextLine();
        
        System.out.print("How much is your withdrawal: R");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        System.out.println("Your withdrawal is: R" + amount);
        transactionHistory.add("Withdrawal: R" + amount);
        balance -= amount;
    }
        scanner.nextLine();
    }
    static void getBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your bank balance: R");
        balance = scanner.nextDouble();
        System.out.println("Your current balance is: R" + balance);
    }

    static void getHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    static void transferBetweenAccounts() {
        Scanner scanner = new Scanner(System.in);
      boolean validResponse = false;

        while (!validResponse) {
            System.out.print("Would you like to transfer your money? (Yes/No): ");
            String response = scanner.nextLine();

            if (response.equals("Yes")) {
                System.out.println("You may transfer.");
                validResponse = true;
            } else if (response.equals("No")) {
                System.out.println("Thank you for using GLS services.");
                validResponse = false;
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'No'.");
                scanner.close();
            }
         scanner.nextLine();
        System.out.print("Enter the amount to transfer: R");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        System.out.print("Enter the account number to transfer to: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Successfully transferred R" + amount + " to account number " + accountNumber);
        balance -= amount;
        transactionHistory.add("Transfer: R" + amount + " to account number " + accountNumber);
    }
    }
    public static void main(String[] args) {
        hello();
        deposits();
        withdrawals();
        getBalance();
        getHistory();
        transferBetweenAccounts();
    }
}