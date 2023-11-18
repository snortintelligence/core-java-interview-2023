package org.practice.app.chapter.strings;

public class StringApp {
    public static void main(String[] args) {

        /*
         * object is stored in the string pool (a special area of the heap),
         * and it can be shared among multiple references if they have the same value.
         * This is known as string interning, and it helps conserve memory by reusing identical strings.
         *
         * */
        String str1 = "Hello World";
        /*
         *  object is stored in the heap memory. This is because the new keyword explicitly
         *  creates a new object on the heap, regardless of whether
         *  it's a String or any other type of object.
         *
         * */
        String str2 = new String("Hello World");
        String str3 = "Hello World";
        //checking str1==str2 are pointing to same location or not in String pool
        System.out.println("str1==str2 => "+(str1==str2));
        System.out.println("str1==str3 => "+(str1==str3));

        String str4 = new String("Hello World");
        System.out.println("str2==str4 => "+(str2==str4));

        String str5 = "Hello World".intern(); //return string from String CP area if str exist.
        System.out.println("str1==str5 => "+(str1==str5));

    }
}
