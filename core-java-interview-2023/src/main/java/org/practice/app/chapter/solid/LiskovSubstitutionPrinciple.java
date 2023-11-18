package org.practice.app.chapter.solid;

/*
* The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented design.
* if a class is a subclass of another class, it should be usable as a drop-in replacement for the parent class without causing unexpected behavior.
 *
* */
public class LiskovSubstitutionPrinciple {

    public static void calculateShapeArea(Shape anyShape){
        System.out.println("Area of "+anyShape.getClass().getSimpleName()+" : "+anyShape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30);
        Circle circle = new Circle(3);
        //apply LSP
        calculateShapeArea(rectangle);
        calculateShapeArea(circle);
    }

}//end of LiskovSubstitutionPrinciple
