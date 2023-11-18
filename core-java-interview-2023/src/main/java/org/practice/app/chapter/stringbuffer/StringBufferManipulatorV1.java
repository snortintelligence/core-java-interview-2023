package org.practice.app.chapter.stringbuffer;

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
public class StringBufferManipulatorV1 implements Runnable {
    /*
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private StringBuffer stringBuffer;
    private String threadName;

    public StringBufferManipulatorV1(StringBuffer stringBuffer, String threadName) {
        this.stringBuffer = stringBuffer;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Perform some StringBuffer operations : appending given string 5 times.
        for (int i=1; i<=5; i++){
            stringBuffer.append("Thread Name: " + threadName + " - Iteration time(s): " + i + "\n");
            // Simulate some work
            try {
                Thread.sleep(1000); //wait for 1-second after appending the string
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // Display the contents of the buffer
        System.out.println(threadName + " - Final StringBuffer Content:\n" + stringBuffer.toString());
    }
}
