package banking;

import java.util.Scanner;

public class LoggedIn {
    static Scanner scanner = new Scanner(System.in);

    public static void process() {
        while (scanner.hasNext()) {
            int loggedMenuChoice = scanner.nextInt();
            if (loggedMenuChoice == 1) {
                //verify balance, for now:
                System.out.println("Balance = 0");
                Display.loggedInDisplay();
            }
            if (loggedMenuChoice == 2) {
                System.out.println("You have successfully logged out!");
                Display.initialDisplay();
                break;
            }
            if (loggedMenuChoice == 0) {
                Display.exit();
            }

        }
    }
}
