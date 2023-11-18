package org.practice.app.chapter.stringbuffer;

import java.util.Scanner;

public class SB {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(solve(S,L,R));
        //
    }

    //complete the function below

    public static String solve(String s, int L, int R)
    {

        String start = s.substring(0, L);
        String end = s.substring(R+1);
        StringBuffer sb = new StringBuffer(s);
        String str = new StringBuffer(sb.substring(L,R+1)).reverse().toString();
        return start+str+end;
        // abcdefghijkl ==> abgfedchijkl
    }
}
