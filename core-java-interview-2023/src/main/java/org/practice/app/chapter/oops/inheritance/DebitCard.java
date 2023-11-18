package org.practice.app.chapter.oops.inheritance;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Debit Card payment.");
    }
}
