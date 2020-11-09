package com.company;

public class Menu {
    //constructor

    // méthodes
    public static void welcomeMessage() {
        String message = "We will rate students with grades and take the " +
                "average rate";
        String bars = "\n";
        for (int i = 0; i < message.length(); i++) {
            if (i == message.length()) {
                bars += "-\n";
            } else {
                bars += "-";
            }
        }
        System.out.println(bars + "\nWelcome to the School\n" + message + bars);

    }

    public static void launchApplication() {
        School mySchool = new School();
        mySchool.listStudentName(School.getStudentsArray());
    }

    // getters

    // setters

    // variables membres
}
