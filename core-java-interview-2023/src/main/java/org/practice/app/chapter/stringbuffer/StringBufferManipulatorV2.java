package org.practice.app.chapter.stringbuffer;

import java.text.SimpleDateFormat;
import java.util.Date;

/*

* Write a java program to satisfy the statement below:-
*
* StringBuffer is thread-safe since it is synchronised.
* It means that two threads can’t execute the StringBuffer functions at the same time.
* If they call the StringBuffer function at the same time,
* only one of the two threads acquires the lock and executes the method.
* The second thread has to wait until the execution of the first thread has been completed.
*
* */
public class StringBufferManipulatorV2 implements Runnable {

    private StringBuffer sharedBuffer;
    private String threadName;

    public StringBufferManipulatorV2(StringBuffer sharedBuffer, String threadName) {
        this.sharedBuffer = sharedBuffer;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Perform some StringBuffer operations : appending given string 5 times.
        for (int i=1; i<=5; i++){
            /*

            * This line defines a synchronized block and specifies sharedBuffer as the monitor (or lock) object.
            * The monitor object is used to control access to the code within the synchronized block.
            * Only one thread can hold the monitor object at a time, and other threads attempting to enter this
            * block will be blocked until the monitor is released.
            *
            * */
            synchronized (sharedBuffer){
                // this is the critical section that you want to protect from concurrent access.
                String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
                String logMessage = threadName + " - " + timestamp + " - writing...";
                System.out.println(logMessage);
                sharedBuffer.append("Thread Name: " + threadName + " - Iteration time(s): " + i + "\n");
                System.out.flush(); //Since it's within the synchronized block, it ensures that only one thread can execute this line at a time. Other threads attempting to execute this line will be blocked until the monitor object (stringBuffer in this case) is released.
            }

            // Simulate some work
            try {
                Thread.sleep(100); //wait for 1-second after appending the string
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // Display the contents of the buffer
        System.out.println(threadName + " - Final StringBuffer Content:\n" + sharedBuffer.toString());
    }
}
