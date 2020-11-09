package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GradeList {
    //constructor

    protected GradeList(int p_numberOfGrade) {
        m_iGradeArray = new String[p_numberOfGrade];
        fillTheGradeListe(m_iGradeArray);
    }

    // méthodes

    /**
     * this function fill the array of grade for a student
     *
     * @param p_gradeArray - the array to fill with grade
     */
    private static void fillTheGradeListe(String[] p_gradeArray) {
        // regex
        String theUserGradeInput;

        // remplissage du tableau
        for (int i = 0; i < p_gradeArray.length; i++) {
            do {
                System.out.println("How much is th grade N°" + (i + 1) + "?");
                theUserGradeInput = userInput.next();
            } while (!isGradeValide(theUserGradeInput));
            p_gradeArray[i] = theUserGradeInput;
        }
    }

    public static boolean isGradeValide(String p_sTheUserInput) {
        String regex = "^[ ]?(?:1?\\d(?:[.,]\\d{1,2})?|20(?:[.,]0?0?)?)[ ]?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(p_sTheUserInput);
        boolean isValid = matcher.matches();
        if (!isValid) {
            System.out.println("This Grade isn't Valid, try again!");
            return false;
        }
        return true;
    }

    // getters

    // setters

    // variables membres
    private String[] m_iGradeArray;
    static Scanner userInput = new Scanner(System.in);
}
