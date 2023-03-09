package atminterface;

import static atminterface.ATMInterface.list;
import java.util.ArrayList;

public class Withdraw {

    public static int withdrawMoney(ArrayList<String> list, int withdrawAmount, int currentBalance) {
        if (currentBalance >= withdrawAmount) {
            currentBalance -= withdrawAmount;
            System.out.println("Amount withdrawn!!");
            list.add("Withdraw: " + withdrawAmount + " ||Balance: " + currentBalance);
        } else {
            System.out.println("Insufficient Balance!!");
        }
        return currentBalance;
    }
}