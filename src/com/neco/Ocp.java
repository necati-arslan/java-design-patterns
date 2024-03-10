package com.neco;

// Open/Closed Principle (OCP)
//  this principle states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
public class Ocp {
}

// Shape.java
 interface Shape {
    double calculateArea();
}

// Rectangle.java
 class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle.java
 class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator.java
 class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
/*
* Now, suppose we want to add a new shape, such as a triangle, to our system. We can easily do this without modifying existing code.
*  We would create a new class Triangle that implements the Shape interface and provides its own implementation of the calculateArea() method.
* Then, we can use the Triangle class without any changes to the AreaCalculator or other existing classes,
* thereby adhering to the Open/Closed Principle.
* */
