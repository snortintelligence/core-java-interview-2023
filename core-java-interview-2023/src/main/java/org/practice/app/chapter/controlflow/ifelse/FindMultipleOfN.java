package org.practice.app.chapter.controlflow.ifelse;

import java.util.Scanner;

public class FindMultipleOfN {
    public static void main(String[] args) {

        Scanner inp  = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();



        if(M%3==0 && M%5==0){

        }else if(M%3!=0 && M%5==0){

        }else if(M%3==0 && M%5!=0){

        }else{

        }
    }
}
