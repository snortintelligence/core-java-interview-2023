package org.practice.app.chapter.strings.questions;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
        System.out.println(lengthOfLastWord("InterviewBit"));
    }
    public static int lengthOfLastWord(String text){
        String[] words = text.split("\\s"); //store back each word
        return (words.length>0) ? words[words.length-1].length() : 0;
    }
}
