package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1==obj2);
        System.out.println(obj1.increment());





       /*

      static değişkenler, bir sınıfın tüm örnekleri (instance) arasında paylaşılır ve
      sadece bir kopyası bellekte tutulur.
       MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.incrementCount();
        System.out.println(obj1.count);
        obj2.incrementCount();
        System.out.println(obj1.count);*/





    }
}
