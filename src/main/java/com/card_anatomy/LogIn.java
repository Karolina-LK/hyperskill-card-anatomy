package com.card_anatomy;

import java.util.Scanner;

public class LogIn {
    static Scanner scanner = new Scanner(System.in);

    static public void loggingIn() {
        System.out.println("Enter your card number:");

        while (scanner.hasNext()) {
            long cardNo = scanner.nextLong();
            String cardNoLength = String.valueOf(cardNo);
            if (cardNoLength.length() == 16) {
                System.out.println("Enter your PIN:");
            } else {
                Display.wrongNo();
                Display.initialDisplay();
                break;
            }
            int pin = scanner.nextInt();
            String pinLength = String.valueOf(pin);
            if(pinLength.length() == 4) {
                //validate, so far:
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



