package com.neco;
/*
- Abstract classes in Java are used to provide a common definition for subclasses.
- Template for Subclasses: Abstract classes serve as templates for other classes.
- Force Subclass Implementation: Abstract classes can contain abstract methods, which are methods without a body.
- Code Reuse: Abstract classes promote code reuse by allowing multiple subclasses to inherit common functionality from a single abstract class.
* */
public abstract class RegularOrders {
     public abstract void printOrder();//abstract method
}

 class Meals extends RegularOrders {

    public String name = "Meals";
    public int price = 950;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}

 class Beverages extends RegularOrders {

    public String name = "Beverages";
    public int price = 200;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }

}

class Salads extends RegularOrders {

    public String name = "Salads";
    public int price = 50;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }

}

class Desserts extends RegularOrders {

    public String name = "Desserts";
    public int price = 150;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }

}