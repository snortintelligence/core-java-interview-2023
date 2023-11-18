package org.practice.app.chapter.threads.bank;

import java.util.Random;

/*
* Consider a scenario where multiple customers are making online banking transactions concurrently.
* Each customer's transaction is like a separate thread, and there's a shared transaction log (represented by the StringBuffer)
* where details of each transaction need to be recorded.
 *
* */
public class CustomerTransaction implements Runnable {

    private String customerName;
    private StringBuffer transactionLog;
    private double balance;

    public CustomerTransaction(String customerName, StringBuffer transactionLog) {
        this.customerName = customerName;
        this.transactionLog = transactionLog;
        this.balance = 1000.0; // Initial balance for each customer
    }

    @Override
    public void run() {
        Random random = new Random();
        // Simulate a banking transaction
        for (int i = 0; i < 6; i++) {
            // Simulate a random deposit or withdrawal
            double amount = random.nextDouble() * 500.0; // Random amount between 0 and 500
            boolean flag = random.nextBoolean();
            if (flag){
                deposit(amount);
            }else{
                withdraw(amount);
            }

            // Log the transaction in the shared transaction log using synchronization
            synchronized (transactionLog){
                transactionLog.append("Transaction #" + i + " by " + customerName + ": ");
                transactionLog.append("Balance: " + balance + ", ");
                transactionLog.append("Amount: " + amount + ", ");
                transactionLog.append("Action: " + (flag ? "Deposit" : "Withdrawal") + "\n");
            }

            // Simulate some processing time
            try {
                Thread.sleep(100); // Wait for 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }

    }

    private synchronized void deposit(double amount){
        balance += amount;
    }

    private synchronized void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        }else{
            System.out.println(customerName + " attempted to withdraw " + amount + " but had insufficient funds.");
        }
    }


}
