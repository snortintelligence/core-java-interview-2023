package org.practice.app.chapter.java8.interfacef1;

/**
 * Problem : Class 'Car' must either be declared abstract or implement abstract method 'stop()' in 'Vehicle'
 *
 * */
//public abstract class Car implements Vehicle {
//    //Solution 1 before java 8: Class 'Car' must either be declared abstract because we added new feature method into the existing Interface
     //To avoid this problem mean If we add a new feature method into an existing interface then we must add default ot static method.
//    @Override
//    public void start() {
//
//    }
//}

//public class Car implements Vehicle {
//    //Solution 2 before java 8: implement abstract method 'stop()' in 'Vehicle' because we added new feature method into the existing Interface
//    //To avoid this problem mean If we add a new feature method into an existing interface then we must add default ot static method.
     //Warning : do not add abstract method inside the existing interface, must add a static or a default method which don't make break your code.
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}

public class Car implements Vehicle {
    //Solution 2 before java 8: implement abstract method 'stop()' in 'Vehicle' because we added new feature method into the existing Interface
    //To avoid this problem mean If we add a new feature method into an existing interface then we must add default ot static method.
    @Override
    public void start() {

    }
}