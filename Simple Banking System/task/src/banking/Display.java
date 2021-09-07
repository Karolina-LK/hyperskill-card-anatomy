package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    public static Scanner scanner = new Scanner(System.in);
    public static int mainMenuChoice;

    public static void initialDisplay() {
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
    }

    public static void loggedInDisplay() {
        System.out.println("1. Balance\n" +
                "2. Log out\n" +
                "0. Exit");
    }

    public static void exit() {
        System.out.println("Bye!");
    }

    public static void wrongNo() {
        System.out.println("Wrong card number or PIN!");
    }

    public static void correctNo() {
        System.out.println("Please choose the correct number, 2, 1 or 0");
    }

    public static void initialChoice() {

        while (scanner.hasNext()) {
            mainMenuChoice = scanner.nextInt();

            if (mainMenuChoice == 1) {
                //create account
                Display.initialDisplay();
            } else if (mainMenuChoice == 2) {
                LogIn.loggingIn();

            } else if (mainMenuChoice == 0) {
                Display.exit();
                break;

            } else {
                correctNo();
                Display.initialDisplay();
            }
           // break;

            //scanner.close();
        }
    }


}
