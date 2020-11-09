package com.company;

public class Student {
    //constructor

    public Student(String name) {
          m_sName = name;
    }

    // méthodes

    private void askName() {
        System.out.println("Quel est le prénom de l'élève N°");
    }

    private void askGradeNumber() {
        System.out.println("Combien de notes par élèves?");
    }

    private void calculateGradeAverage() {
        System.out.println("la moyenne est de ...");
    }

    // getters

    public String getName() {
        return m_sName;
    }

    // setters

    public void setName(String name) {
        m_sName = name;
    }

    // variables membres
    private String m_sName;
    int m_iStudentAverage;// average of his grades
    int m_iGradeNumber;
    // he's fail or not

}
