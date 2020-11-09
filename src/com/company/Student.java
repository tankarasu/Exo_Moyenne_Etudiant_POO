package com.company;

import java.util.Scanner;

public class Student {
    //constructor

    public Student(String name) {
        m_bIsGreeting = false;
        m_sName = name;
        setGradeNumber();
        m_aGradesListe = new String[getGradeNumber()];
        askGrades(m_aGradesListe);
        m_iStudentAverage = calculateGradeAverage();
    }

    // méthodes

    private void askGrades(String[] p_gradeArray) {
        String theUserGradeInput;

        for (int i = 0; i < p_gradeArray.length; i++) {
            do {
                System.out.println("How much is the grade N°" + (i + 1) + " " +
                        "for" +
                        " " + getName() +
                        "?");
                theUserGradeInput = userInput.next();
            } while (!GradeList.isGradeValide(theUserGradeInput));
            p_gradeArray[i] = theUserGradeInput;
        }
    }

    private float calculateGradeAverage() {
        float average = 0;
        for (int i = 0; i < m_aGradesListe.length; i++) {
            average += Float.parseFloat(m_aGradesListe[i]);
        }
        average /= m_aGradesListe.length;

        if (average >= 10) {
            setIsGreeting(true);
        }
        return average;
    }
    //todo set the float of average

    // getters

    public String getName() {
        return m_sName;
    }

    public int getGradeNumber() {
        return m_iGradeNumber;
    }

    public float getStudentAverage() {
        return m_iStudentAverage;
    }

    public boolean getIsGreeting() {
        return m_bIsGreeting;
    }

    // setters

    public void setIsGreeting(boolean IsGreeting) {
        m_bIsGreeting = IsGreeting;
    }

    public void setGradeNumber() {
        System.out.println("How many grades for student named " + getName() + "?");
        String gradeNumber = userInput.next();
        m_iGradeNumber = Integer.parseInt(gradeNumber);
        //todo intégrer la validation de données entrées
    }

    // variables membres
    private String m_sName;
    private float m_iStudentAverage;// average of his grades
    private int m_iGradeNumber;
    Scanner userInput = new Scanner(System.in);
    private String[] m_aGradesListe;
    private boolean m_bIsGreeting;

}
