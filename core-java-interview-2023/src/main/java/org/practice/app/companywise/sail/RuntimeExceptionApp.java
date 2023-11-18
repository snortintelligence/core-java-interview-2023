package org.practice.app.companywise.sail;

public class RuntimeExceptionApp {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,344,55,6};
        System.out.println(arr[77]); //RuntimeException will raise : index not present
    }
}
