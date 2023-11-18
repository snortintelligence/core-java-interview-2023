package org.practice.app.chapter.generics;

public class AnyNumber <T>{
    private T number;

    public AnyNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
