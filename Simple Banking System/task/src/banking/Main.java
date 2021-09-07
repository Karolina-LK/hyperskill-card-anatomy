package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        Display.initialDisplay();

        try {
            Display.initialChoice();
        } catch (InputMismatchException e) {
            System.out.println("boom");
            Display.correctNo();
       //     scanner.close();

        }
        Display.initialDisplay();
        Scanner scanner2 = new Scanner(System.in);
        Display.mainMenuChoice = scanner2.nextInt();
        Display.initialChoice();


    }


}


