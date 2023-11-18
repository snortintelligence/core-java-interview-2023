package org.practice.app.chapter.oops.inheritance;

public class UPI implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("UPI payment.");
    }
}
