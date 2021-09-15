package banking;

import java.util.Scanner;

public class LogIn {
    static Scanner scanner = new Scanner(System.in);

    static public void loggingIn() {
        System.out.println("Enter your card number:");

        while (scanner.hasNext()) {
            long putCardNo = scanner.nextLong();
            String putCardNoLength = String.valueOf(putCardNo);
            if (putCardNoLength.length() == 16) {
                System.out.println("Enter your PIN:");
            } else {
                Display.wrongNo();
                Display.initialDisplay();
                break;
            }
            String pin = scanner.next();
            String pinLength = String.valueOf(pin);
            if (pinLength.length() == 4) {
                //validate, so far:
//                if(cardData.containsValue(cardNo)){
//                    cardData.get(cardNo);
//                }
//                if(cardNo.equals(pin)){
//                    System.out.println("boom");
//                }
                System.out.println("You have successfully logged in!");
                Display.loggedInDisplay();
                LoggedIn.process();
            } else {
                Display.wrongNo();
                Display.initialDisplay();
                break;
            }
            break;
        }
    }
}



