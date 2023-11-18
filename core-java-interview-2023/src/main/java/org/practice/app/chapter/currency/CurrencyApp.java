package org.practice.app.chapter.currency;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyApp {
    public static void main(String[] args) {
        double payment = 98789.09;

        NumberFormat paymentFormat = NumberFormat.getCurrencyInstance();
        String localPayment = paymentFormat.format(payment);
        System.out.println(localPayment);

        paymentFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String CHINA = paymentFormat.format(payment);
        System.out.println(CHINA);

        paymentFormat = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        String CANADA_FRENCH = paymentFormat.format(payment);
        System.out.println(CANADA_FRENCH);

        paymentFormat = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        String GERMAN = paymentFormat.format(payment);
        System.out.println(GERMAN);

        paymentFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String US = paymentFormat.format(payment);
        System.out.println(US);

        Locale indianLocale = new Locale("en", "IN");
        paymentFormat = NumberFormat.getCurrencyInstance(indianLocale);
        String IND = paymentFormat.format(payment);
        System.out.println(IND);

    }
}
