package atminterface;

import static atminterface.ATMInterface.list;
import java.util.ArrayList;

public class Deposit {

    public static int depositMoney(ArrayList<String> list, int depositAmount, int currentBalance) {
        currentBalance += depositAmount;
        System.out.println("Your money has been successfully deposited!!");
        list.add("Deposit: " + depositAmount + " || Balance: " + currentBalance);
        return currentBalance;
    }
}
