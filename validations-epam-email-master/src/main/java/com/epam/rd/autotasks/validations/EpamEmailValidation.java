package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        // Put your code here
        //String regexpr = "^[a-z]+[_][a-z]+[0-9]?@[epam.com]$";
        String regexpr = "^[a-zA-Z\\d_!#$%&'*+/=?`{|}~^.-]+_[a-zA-Z\\d_!#%&'*+/=?`{|}~^.-]+@[a-zA-Z\\d.-]+.[com]+$";
        if(email == null || email.equals("") || email.equals(" ")) return false;
        Pattern p = Pattern.compile(regexpr);

        Matcher matcher = p.matcher(email);


        return matcher.matches();

    }
}





