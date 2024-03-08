package com.neco;


public class Car {
    private String registrationNumber;
    private boolean rented;

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        this.rented = false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnCar() {
        rented = false;
    }
}