package com.neco;

// Superclass
public class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
