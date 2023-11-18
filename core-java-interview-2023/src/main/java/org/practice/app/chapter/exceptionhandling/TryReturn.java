package org.practice.app.chapter.exceptionhandling;

public class TryReturn {
    public static void main(String[] args) {
        try {
            return;
        }finally {
            System.out.println("Finally");
        }
    }
}
