package com.company;

import java.util.Scanner;

public class School {
    //constructor

    public School() {
        askStudentNumber();
        int studentNumber = m_iStudentNumber;
        m_aStudentsArray = new Student[studentNumber];
        m_iNumberOfStudentFails = setM_iNumberOfStudentFails(0);
        m_iNumberOfStudentGreetings = setM_iNumberOfStudentGreetings(0);

        // make a student for each student in school
        for (int i = 0; i < m_iStudentNumber; i++) {
            String studentName;
            System.out.println("Separate composed name with - please,");
            System.out.println("You can also type all or some names separated" +
                    " with a blank space");
            do {
                System.out.println("What's the name of student N°" + (i + 1) + "?");
                studentName = userInput.next();
            } while (!Functions.isNameValid(studentName));
            m_aStudentsArray[i] = new Student(studentName);
        }

        makeReport(m_aStudentsArray);

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


    private void listStudentGreetings() {
    }

    private void calculateAverageFailingStudent() {
    }

    private void calculateAverageGreetingStudent() {
    }

    public void makeReport(Student[] p_aStudentArray) {

        // list all Student with his average
        for (int i = 0; i < p_aStudentArray.length; i++) {
            System.out.println(p_aStudentArray[i].getName() + " have an " +
                    "average of " + p_aStudentArray[i].getStudentAverage());
        }

        // show the number of student who fails
        for (int i = 0; i < p_aStudentArray.length; i++) {
            if (!p_aStudentArray[i].getIsGreeting()) {
                this.setM_iNumberOfStudentFails(getNumberOfStudentFails() + 1);
            } else {
                this.setM_iNumberOfStudentGreetings(getM_iNumberOfStudentGreetings() + 1);
            }
        }
        System.out.println("There's " + this.getM_iNumberOfStudentGreetings() + " students who Greets " +
                "and " + this.getNumberOfStudentFails() + " students who Fails");

    }

    // getters


    public int getNumberOfStudentFails() {
        return m_iNumberOfStudentFails;
    }

    public int getStudentNumber() {
        return m_iStudentNumber;
    }

    public static Student[] getStudentsArray() {
        return m_aStudentsArray;
    }

    public int getM_iNumberOfStudentGreetings() {
        return m_iNumberOfStudentGreetings;
    }

    // setters

    public void setStudentNumber(int StudentNumber) {
        m_iStudentNumber = StudentNumber;
    }

    public int setM_iNumberOfStudentFails(int NumberOfStudentFails) {
        return m_iNumberOfStudentFails = NumberOfStudentFails;
    }

    public int setM_iNumberOfStudentGreetings(int NumberOfStudentGreetings) {
        return m_iNumberOfStudentGreetings = NumberOfStudentGreetings;
    }

    // variables membres
    private int m_iStudentNumber;
    Scanner userInput = new Scanner(System.in);
    private static Student[] m_aStudentsArray;
    private int m_iNumberOfStudentFails;
    private int m_iNumberOfStudentGreetings;
}
