package com.company;

public class Menu {

    // méthodes
    public static void welcomeMessage() {
        String message = "We will rate students with grades and take the " +
                "average rate";
        StringBuilder bars = new StringBuilder("\n");
        bars.append("-".repeat(message.length()));
        System.out.println(bars + "\nWelcome to the School\n" + message + bars);

    }

    public static void launchApplication() {
        new School();
    }

}
