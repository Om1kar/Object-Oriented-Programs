package AccountManagement;

import java.util.Scanner;

public class Account {
    public double balance;
    // method to check account balance and debit some amount
    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for Debit:");
        int debitAmount = sc.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debit amount is = " + debitAmount);
            System.out.println("------------------------------------------");
            System.out.println("Remaining Balance In Account " + balance);
        } else {
            System.out.println("Debit amount exceeded Account balance");
        }
    }
    public void showBalance() {
        /*
        to show balance
         */
        System.out.println("-------------------");
        System.out.println("Balance = "+ balance);
    }
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        int choice ;
        System.out.println("Enter the account balance  ");
        account.balance = scanner.nextDouble();

        do {
            System.out.println("----------------------------------------------");
            System.out.println("Select Options--");
            System.out.println("1]Debit || 2]Show Balance || 3]Exit");
            System.out.println("Enter Choice :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> account.debit();
                case 2 -> account.showBalance();
                case 3 -> System.out.println("Thank you for Using Our Service");
                default -> System.out.println("Please select Valid Option");
            }
        } while (choice != 3);
    }
}

