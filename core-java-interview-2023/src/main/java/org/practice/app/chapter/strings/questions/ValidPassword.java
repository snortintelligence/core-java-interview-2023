package org.practice.app.chapter.strings.questions;

/*
* Given a password as a character array A.
Check if it is valid or not.
Password should have at least one numerical digit(0-9).
Password's length should be in between 8 to 15 characters.
Password should have at least one lowercase letter(a-z).
Password should have at least one uppercase letter(A-Z).
Password should have at least one special character ( @, #, %, &, !, $, *).
*
* To determine if a given regular expression pattern is syntactically correct in Java,
* you can use a try-catch block when compiling the pattern using Pattern.compile().
* If the pattern is syntactically incorrect, it will throw a PatternSyntaxException. Here's an example of how to do this
*
* */

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your password : ");
        String pwd = s.nextLine();
        System.out.println(validPassword(pwd)==true ? "Valid password" :"Not a valid password");
        System.out.println(validPassword(pwd.toCharArray())==1 ? "Valid password" :"Not a valid password");
        s.close();
    }

    static boolean validPassword(String password){
        if(password.length()<8 && password.length()>15) {
            return false;
        }
        if(!Pattern.compile("\\d").matcher(password).find()) {
            return false;
        }
        if(!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }
        if(!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }
        if(!Pattern.compile("[@#%&!$*]").matcher(password).find()) {
            return false;
        }
        return true;
    }

    static int validPassword(char[] password){
        boolean isDigit=false;
        boolean isLowercase=false;
        boolean isUppercase=false;
        boolean isSymbol=false;

        for (char inputChar: password) {
            if(Character.isDigit(inputChar)){
                isDigit=true;
            }
            else if(Character.isLowerCase(inputChar)){
                isLowercase=true;
            }
            else if(Character.isUpperCase(inputChar)){
                isUppercase=true;
            }
            else if("@#%&!$*".indexOf(inputChar) != -1){
                isSymbol=true;
            }
        }
        return isDigit && isLowercase && isUppercase && isSymbol ? 1 : 0;
    }

}
