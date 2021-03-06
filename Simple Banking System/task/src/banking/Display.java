package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    public static Scanner scanner = new Scanner(System.in);
    public static int mainMenuChoice = -1;

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
        System.out.println("\n" + "Bye!");
        System.exit(0);
    }

    public static void wrongNo() {
        System.out.println("\n" + "Wrong card number or PIN!" + "\n");
    }

    public static void correctNo() {
        System.out.println("Please type the correct number");
    }

    public static void initialChoice() {
        while (scanner.hasNext()) {
            try {
                String input = scanner.nextLine();
                mainMenuChoice = Integer.parseInt(input);

                if (mainMenuChoice == 1) {
                    CreatingAccount.createCardData();
                    Display.initialDisplay();
                } else if (mainMenuChoice == 2) {
                    LogIn.loggingIn();
                } else if (mainMenuChoice == 0) {
                    Display.exit();
                } else {
                    correctNo();
                    Display.initialDisplay();
                }
            } catch (NumberFormatException e) {
                Display.correctNo();
                Display.initialDisplay();
            }
        }
    }
}
