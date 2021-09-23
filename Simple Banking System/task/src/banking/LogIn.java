package banking;

import java.util.Scanner;

public class LogIn {
    static Scanner scanner = new Scanner(System.in);

    static public void loggingIn() {
        System.out.println("\n" + "Enter your card number:");

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
            if (ValidatingAccount.checkAccount(String.valueOf(putCardNo), pin)) {
                System.out.println("\n"+ "You have successfully logged in!" + "\n");
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



