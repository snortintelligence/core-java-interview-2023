package org.practice.app.chapter.oops.inheritance;

public class PaymentApp {
    public static void pay( PaymentMethod payment ){
        payment.pay();
    }

    public static void main(String[] args) {
        //Runtime Polymorphism
        PaymentMethod paymentMethod = new CreditCard();
        pay(paymentMethod);
    }
}
