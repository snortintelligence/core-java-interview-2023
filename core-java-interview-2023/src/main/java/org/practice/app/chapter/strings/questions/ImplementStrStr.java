package org.practice.app.chapter.strings.questions;

/*
*
* The "Implement strStr()" problem is a classic string manipulation problem.
* The goal is to find the first occurrence of a substring (needle) within a given string (haystack)
* and return the starting index of the substring in the haystack.
* If the needle is not found in the haystack, you should return -1.
* To achieve better efficiency, you can implement a more efficient
* algorithm like the Knuth-Morris-Pratt (KMP) algorithm, which has a linear time complexity of O(N + M).
* */
public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("Hello World", "ll"));
    }

    static int strStr(String heyStackStr, String needleStr){
    //Let's say M is length of haystack and N is length of needle. Then expected complexity here is O(N*M).
        //get length of both strings
        if(needleStr.isEmpty() || heyStackStr.isEmpty()) {
            return -1;
        }
        int heyStackStrLength = heyStackStr.length();
        int needleStrLength = needleStr.length();

        for(int i=0; i<=heyStackStrLength - needleStrLength; i++){
            //outer loop for heyStackStr traverse
            int j=0;
            for (j = 0; j < needleStrLength; j++) {
                //1. find matching character of needleStr in the heyStackStr
                if(heyStackStr.charAt(i + j) != needleStr.charAt(j)){
                    break;
                }
            }//end of inner loop
            if(j==needleStrLength){
                return i; //position of matching string index
            }
        }//end of outer loop
        return -1;
    }//end of strStr
}
