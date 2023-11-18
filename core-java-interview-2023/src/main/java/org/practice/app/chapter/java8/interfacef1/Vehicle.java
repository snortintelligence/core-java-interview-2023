package org.practice.app.chapter.java8.interfacef1;

//public interface Vehicle {
//    void start();
//
//    void stop();
//
//}

@FunctionalInterface
public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("stop the vehicle.");
    }

    static void park(){
        System.out.println("park your vehicle carefully...");
    }

//    void clean();

}
