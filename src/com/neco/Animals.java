package com.neco;

public class Animals {
}

// Abstract Product
interface Animal {
    void makeSound();
}

// Concrete Products
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Concrete Products
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Miav");
    }
}

// Creator
abstract class AnimalFactory {
    abstract Animal createAnimal();
}

// Concrete Creators
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}

// Concrete Creators
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}