package com.card_anatomy;

public class Display {
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
}
