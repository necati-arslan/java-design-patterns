package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount obj1 = new BankAccount("ING123",50);
        obj1.withdraw(10);

        Car car1= new Car("AASDF");
        car1.rent();
        System.out.println(car1.isRented());

        System.out.println(obj1.getBalance());
    }
}

/*
*
2. Encapsulation: Encapsulation ensures that the internal state of an object is protected from direct manipulation by other parts of the program.
   The Person class encapsulates the data related to a person, including their name and age.
    Public getter methods (getName() and getAge()) are provided to allow access to the encapsulated fields.
   Encapsulation ensures that the internal state of an object is protected from direct manipulation by other parts of the program.
* */