package org.practice.app.chapter.solid;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
