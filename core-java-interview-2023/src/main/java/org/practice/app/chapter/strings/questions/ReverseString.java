package org.practice.app.chapter.strings.questions;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(new StringBuffer("the sky is blue").reverse());
        System.out.println(reverseString(" the sky is blue "));
    }

    public static String reverseString(String text){
        String words[] = text.split("\\s+");
        StringBuffer output = new StringBuffer();
        for(int i=words.length-1; i>=0; i--){
            output.append(words[i]).append(" ");
        }
        return output.toString().trim();
    }

    public static String reverseWords(String text){
        /*
        * This is just a brute force problem which can be simulated in one or two pass of the main string.
        * Try to focus on the words(begining and ending positions) instead of extra spaces.
        *
        * */
        return null;
    }

}
