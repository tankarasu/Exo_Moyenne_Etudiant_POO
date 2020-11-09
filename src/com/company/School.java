package com.company;

import java.util.Scanner;

public class School {
    //constructor

    public School() {
        askStudentNumber();
        int studentNumber = m_iStudentNumber;
        m_aStudentsArray = new Student[studentNumber];

        // make a student for each student in school
        for (int i = 0; i < m_iStudentNumber; i++) {
            String studentName = "";
            System.out.println("Separate composed name with - please,");
            System.out.println("You can also type all or some names separated" +
                    " with a blank space");
            do {
                System.out.println("What's the name of student N°" + (i + 1) + "?");
                studentName = userInput.next();
            } while (!Functions.isNameValid(studentName));
            m_aStudentsArray[i] = new Student(studentName);
        }

    }

    // méthodes


    /**
     * this function set the number of students in the school
     */
    public void askStudentNumber() {

        String theNumberStudentInput;

        do {
            System.out.println("How many students to rate?");
            theNumberStudentInput = userInput.next();
        } while (!Functions.isNumberValid(theNumberStudentInput));
        setStudentNumber(Integer.parseInt(theNumberStudentInput));
        System.out.println("there's " + m_iStudentNumber +
                " students in this school");
    }

    private void listStudentFails() {
        System.out.println("Students who fails are ... with an average of ...");
    }

    private void listNumberOfFails() {
    }

    private void listStudentGreetings() {
    }

    private void listNumberOfGreetings() {
    }

    private void calculateAverageFailingStudent() {
    }

    private void calculateAverageGreetingStudent() {
    }

    private void averageAllStudent() {
    }

    public static void listStudentName(Student[] p_aStudentArray) {
        for (int i = 0; i < p_aStudentArray.length; i++) {
            System.out.println(p_aStudentArray[i].getName());
        }

    }

    // getters

    public int getStudentNumber() {
        return m_iStudentNumber;
    }

    public static Student[] getStudentsArray() {
        return m_aStudentsArray;
    }

    // setters

    public void setStudentNumber(int StudentNumber) {
        m_iStudentNumber = StudentNumber;
    }

    // variables membres
    private int m_iStudentNumber;
    Scanner userInput = new Scanner(System.in);
    private static Student[] m_aStudentsArray;
    private int m_iNumberOfStudentFails;
    private int m_iNumberOfStudentGreetings;
}
