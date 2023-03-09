package atminterface;

import java.util.ArrayList;
import java.util.Scanner;


public class ATMInterface {

    public static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        int currentBalance = 10000;
        int depositAmount;
        int withdrawAmount;
        int transferAmount;
        int pin = 1234;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = kb.nextLine();
        
        while(true)
        {
            System.out.println("---------------Hello " + name + " Welcome to the ATM---------------");
            System.out.println("******************************************************************");
            System.out.println("We provide the following services:-");
            System.out.println("1. View Transaction History\n2.Withdraw Money\n3.Deposit Money\n4.Transfer Money\n5.Quit");
            System.out.println("Choose operation you want to perform: ");
            int choice = kb.nextInt();
            if (choice == 5) {
                System.exit(0);
            }
            System.out.print("Enter your ATM Pin: ");
            int ATMpin = kb.nextInt();
            if (ATMpin == pin) {
                switch (choice) {
                    case 1:
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("Your transaction history is: ");
                        History.checkHistory(list);
                        break;

                    case 2:
                        System.out.println("Enter money to be withdrawn: ");
                        withdrawAmount = kb.nextInt();
                        currentBalance = Withdraw.withdrawMoney(list,withdrawAmount,currentBalance);
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Enter money to be deposited: ");
                        depositAmount = kb.nextInt();
                        currentBalance = Deposit.depositMoney(list, depositAmount, currentBalance);
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Enter the amount to be transferred:");
                        transferAmount = kb.nextInt();
                        currentBalance = Transfer.transferMoney(list, transferAmount, currentBalance);
                        System.out.println();
                        break;

                }
            } else {
               
                System.out.println("Incorrect Pin!! Try Again!!");
                System.out.println();
            }
        }

    }

}
