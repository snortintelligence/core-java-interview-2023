package org.practice.app.chapter.stringbuffer;

/*
*
* In this output, both "Thread-1" and "Thread-2" have interleaved their output in the
* "Final StringBuffer Content" section, indicating that both threads were able to append data
* to the StringBuffer concurrently without proper synchronization.
* This outcome is not what you would typically expect with a synchronized StringBuffer.
*
* */

public class StringBufferThreadAppV1 {
    public static void main(String[] args) {

        //passing commonStringBuffer obj ref to append new string for each thread
        StringBuffer commonStringBuffer = new StringBuffer();
        // passing runnable ref type : StringBufferManipulatorV1 2 threads
        Thread thread1 = new Thread(new StringBufferManipulatorV1(commonStringBuffer,"Thread-1"));
        Thread thread2 = new Thread(new StringBufferManipulatorV1(commonStringBuffer,"Thread-2"));

        // Start both threads at sametime
        thread1.start();
        thread2.start();

    }
}
