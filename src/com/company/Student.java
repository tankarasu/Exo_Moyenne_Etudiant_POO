package com.company;

import java.util.Scanner;

public class Student {
    //constructor

    public Student(String name) {
        m_sName = name;
        setGradeNumber();
        m_aGradesListe = new String[getGradeNumber()];
        askGrades(m_aGradesListe);
    }

    // méthodes

    private void askGrades(String[] p_gradeArray) {
        String theUserGradeInput;

        for (int i = 0; i < p_gradeArray.length; i++) {
            do {
                System.out.println("How much is th grade N°" + (i + 1) + " " +
                        "for" +
                        " " + getName() +
                        "?");
                theUserGradeInput = userInput.next();
            } while (!GradeList.isGradeValide(theUserGradeInput));
            p_gradeArray[i] = theUserGradeInput;
        }
    }

    private void calculateGradeAverage() {
        System.out.println("la moyenne est de ...");
    }

    // getters

    public String getName() {
        return m_sName;
    }

    public int getGradeNumber() {
        return m_iGradeNumber;
    }

    // setters

    public void setGradeNumber() {
        System.out.println("How many grades for student named " + getName() + "?");
        String gradeNumber = userInput.next();
        m_iGradeNumber = Integer.parseInt(gradeNumber);
        //todo intégrer la validation de données entrées
    }

    // variables membres
    private String m_sName;
    int m_iStudentAverage;// average of his grades
    private int m_iGradeNumber;
    Scanner userInput = new Scanner(System.in);
    private String[] m_aGradesListe;

    // he's fail or not

}
