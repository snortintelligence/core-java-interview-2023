package org.practice.app.chapter.solid;

public class Circle extends Shape{
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
