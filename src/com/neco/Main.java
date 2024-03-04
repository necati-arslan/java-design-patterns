package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Combos combos = new FamilyCombo();;


        System.out.println(combos.regularOrders);


       // Combos combos1 = ComboCreator.createComobos(ComboCode.FAMILY);
        //combos1.printOrder();

        //Combos combos2 = ComboCreator.createComobos(ComboCode.MEGA);
        //combos2.printOrder();




       /* AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();  // Output: Woof

        // Polymorphism, in the context of object-oriented programming, refers to the ability of objects of different classes to be treated as objects of a common superclass.
        AnimalFactory catFactory = new CatFactory();
        Animal cat=catFactory.createAnimal();
        cat.makeSound();



        System.out.println("hello");*/
    }
}
