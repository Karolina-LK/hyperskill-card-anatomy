package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Display.initialDisplay();

        while (scanner.hasNext()) {
            int mainMenuChoice = scanner.nextInt();

            if (mainMenuChoice == 1) {
                //create account
                Display.initialDisplay();
            } else if (mainMenuChoice == 2) {
                LogIn.loggingIn();

            } else if (mainMenuChoice == 0) {
                Display.exit();
                //Display.initialDisplay();
                break;
            }
        }
    }


}


