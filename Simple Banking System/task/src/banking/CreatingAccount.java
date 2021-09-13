package banking;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.SortedMap;

public class CreatingAccount {

    static Random random = new Random();

    public static String createCardData() {

        System.out.println("Your card has been created" + "\n" + "Your card number:");
        int[] cardNoMidPart = new int[10];
        for (int i = 0; i < 10; i++) {
            cardNoMidPart[i] = random.nextInt(9);
        }

        StringBuilder builder = new StringBuilder();
        for (int value : cardNoMidPart) {
            builder.append(value);
        }
        String cardNo = 400000 + builder.toString();
        System.out.println(cardNo);

        int[] pinNoDigit = new int[4];
        for (int i = 0; i < 4; i++){
            pinNoDigit[i] = random.nextInt(9);
        }

        StringBuilder builder2 = new StringBuilder();
        for(int digit : pinNoDigit){
            builder2.append(digit);
        }
        String pinNo = builder2.toString();
        System.out.println("Your card PIN:" + "\n" + pinNo);


        HashMap<String, String> cardData = new HashMap<>();
        cardData.put(cardNo, pinNo);
        System.out.println(cardData);
//        return  String.valueOf(accountInfo);
        return " " + "\n";

    }

}
