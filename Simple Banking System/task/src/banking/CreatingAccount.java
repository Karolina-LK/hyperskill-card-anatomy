package banking;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.SortedMap;

public class CreatingAccount {

    static Random random = new Random();

    public static String createCardData() {

        System.out.println("\n" + "Your card has been created" + "\n" + "Your card number:");
        int[] cardNoMidPart = new int[10];
        for (int i = 0; i < 10; i++) {
            cardNoMidPart[i] = random.nextInt(9);
        }

        StringBuilder cardNo = new StringBuilder("400000");
        for (int value : cardNoMidPart) {
            cardNo.append(value);
        }
        System.out.println(cardNo);

        int[] pinNoDigit = new int[4];
        for (int i = 0; i < 4; i++) {
            pinNoDigit[i] = random.nextInt(9);
        }

        StringBuilder pinNo = new StringBuilder();
        for (int digit : pinNoDigit) {
            pinNo.append(digit);
        }
        System.out.println("Your card PIN:" + "\n" + pinNo);
        System.out.println();

        ValidatingAccount.addAccount(cardNo.toString(), pinNo.toString());
        return " " + "\n";

    }

}
