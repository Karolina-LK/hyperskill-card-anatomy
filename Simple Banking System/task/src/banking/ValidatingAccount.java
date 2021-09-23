package banking;

import java.util.HashMap;

public class ValidatingAccount {

    private static HashMap<String, String> cardData = new HashMap<>();

    public static void addAccount(String cardNo, String pinNo) {
        cardData.put(cardNo, pinNo);
    }

    public static boolean checkAccount(String cardNo, String pinNo) {
        String inputNo = cardData.get(cardNo);
        if (inputNo == null || pinNo == null || pinNo.length() != 4) {
            return false;
        }
        return inputNo.equals(pinNo);
    }
}
