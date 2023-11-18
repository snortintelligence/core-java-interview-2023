package org.practice.app.chapter.threads.bank;

public class CustomerTransactionApp {
    public static void main(String[] args) {
        StringBuffer transactionLog = new StringBuffer();
        Thread t1 = new Thread(new CustomerTransaction("Customer-1", transactionLog));
        Thread t2 = new Thread(new CustomerTransaction("Customer-2", transactionLog));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        // Display the final transaction log
        System.out.println("Final Transaction Log:");
        System.out.println(transactionLog.toString());
    }
}
