package bankingsystem;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        BankAccount ba=new BankAccount();
//        ba.addbankaccount();
//        ba.showbankaccount();
        Accounts acc = null;

        System.out.println("Choose Account Type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        int accType = sc.nextInt();

        if (accType == 1) {
            acc = new SavingAccount();
        } else if (accType == 2) {
            acc = new CurrentAccount();
        } else {
            System.out.println("Invalid Account Type. Exiting...");
            return;
        }

        int choice;
        do {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Deposit\n2. Withdraw\n3. View Balance\n4. Interest\n5. Exit");
            choice = sc.nextInt();

            switch(choice) {
                case 1: acc.deposit(); break;
                case 2: acc.withdraw(); break;
                case 3: acc.viewbalance(); break;
                case 4: acc.calculateinterest();  break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid Choice!");
            }

        } while(choice != 5);
        
        sc.close();
    }
}
