package com.neco;

public class Singleton {

    private static Singleton instance = null;
    private  static int count = 0;

    private Singleton(){

    }

    // Static method to get the instance of Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static int increment() {
        count++;
        return count;
    }

}
