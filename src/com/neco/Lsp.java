package com.neco;

//The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented design
// he principle states that objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program.
public class Lsp {
}

// Rectangle.java
 class Rectanglec {
    protected int width;
    protected int height;

    public Rectanglec(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

// Square.java
 class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
/*
* According to the Liskov Substitution Principle, when we pass a Square object to the calculateArea() function,
* it should behave the same as passing a Rectangle object.
*  In our example, despite the special logic in the Square class to ensure that width and height are always the same,
*  it doesn't violate the LSP because a square is a valid subtype of a rectangle, and the calculateArea() f
* unction still behaves as expected with both types of objects.
* */