package org.practice.app.chapter.generics;

public class DataPrinterApp {
    public static void main(String[] args) {
        DataPrinter<String> app = (msg)->System.out.println(msg);
        app.print("Hello World!");
    }
}
