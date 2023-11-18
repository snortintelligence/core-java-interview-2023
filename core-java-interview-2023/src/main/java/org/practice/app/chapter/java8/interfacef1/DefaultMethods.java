package org.practice.app.chapter.java8.interfacef1;

@FunctionalInterface
public interface DefaultMethods {
    void help();
    default String greetings(){return "Hello in Java-8";}
}
