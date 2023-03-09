package atminterface;

import static atminterface.ATMInterface.list;
import java.util.ArrayList;

public class Transfer {

    public static int transferMoney(ArrayList<String> list, int transferAmount, int currentBalance) {
        if (currentBalance < transferAmount) {
            System.out.println("The amount to be transferred is larger than current balance!!");
        } else {
            currentBalance -= transferAmount;
            System.out.println("AMOUNT TRANSFERRED SUCCESSFULLY!!");
            list.add("Transfer: " + transferAmount + " || Balance: " + currentBalance);

        }
        return currentBalance;
    }
}
