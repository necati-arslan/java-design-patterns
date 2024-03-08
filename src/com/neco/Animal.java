package com.neco;


// Superclass
class Animal {
    String species;

    // Constructor
    public Animal(String species) {
        this.species = species;
    }

    // Method
    public void eat() {
        System.out.println(species + " is eating");
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String species, String breed) {
        super(species); // Call to superclass constructor
        this.breed = breed;
    }

    // Method
    public void bark() {
        System.out.println(breed + " is barking");
    }
}

