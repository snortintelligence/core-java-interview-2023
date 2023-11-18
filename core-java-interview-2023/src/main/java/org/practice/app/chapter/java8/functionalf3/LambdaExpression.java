package org.practice.app.chapter.java8.functionalf3;

import org.practice.app.chapter.java8.interfacef1.Vehicle;

//Lambda Expression represents a Functional interface rather than Anonymous class obj
public class LambdaExpression {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("First runnable implementation...");
            }
        };

        Runnable r2 = ()-> System.out.println("Second runnable implementation...");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Vehicle v1 = ()-> System.out.println("Vehicle : Hello from lambda");
        v1.start();
    }
}
