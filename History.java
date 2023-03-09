
package atminterface;

import java.util.ArrayList;

public class History {
      public static void checkHistory(ArrayList<String> list) {
        if (list.size() == 0) {
            System.out.println("History is Empty");
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));

        }
}
}
