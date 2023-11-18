package org.practice.app.chapter.oops.inheritance;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Credit Card payment.");
    }
}
