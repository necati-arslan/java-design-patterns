package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal cat = new Cat();
        Animal dog = new Dog();

        //polymorphism behaviour

        cat.makeSound();
        dog.makeSound();

        Employee fullTimeEmp = new FullTimeEmployee();
        Employee partTimeEmp = new PartTimeEmployee();

        System.out.println("Full-time employee salary: $" + fullTimeEmp.calculateSalary());
        System.out.println("Part-time employee salary: $" + partTimeEmp.calculateSalary());
        System.out.println("hello");
    }
}

/*
* Polymorphism is a programming concept where objects of different classes can be treated as objects of a common superclass,
    and the same method can be implemented in different ways.
* */
