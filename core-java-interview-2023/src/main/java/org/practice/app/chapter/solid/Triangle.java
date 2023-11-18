package org.practice.app.chapter.solid;

/*
*
By adding a new subclass and implementing the calculateArea method for triangles,
* you've extended the functionality of the system without altering the existing classes for circles and rectangles.
* This adheres to the Open/Closed Principle, allowing for easy extension of the software's capabilities without introducing unnecessary
* changes to the existing code.
*
**/
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        //Area = 0.5 × Base × Height
        return 0.5 * this.base * this.height;
    }
}
