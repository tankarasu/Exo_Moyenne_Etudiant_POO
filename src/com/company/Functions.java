package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functions {

    // méthodes

    public static boolean isNumberValid(String p_sTheUserInput){
        String regex = "^[ ]?[1-9]\\d*[ ]?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(p_sTheUserInput);
        boolean isValid = matcher.matches();
        if (!isValid) {
            System.out.println("This entry is not Valid");
            return false;
        }
        return true;
    }

    public static boolean isNameValid(String p_name){
        String regex = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(p_name);
        boolean isValid = matcher.matches();
        if (!isValid) {
            System.out.println("This name is not Valid");
            return false;
        }
        return true;
    }

}
