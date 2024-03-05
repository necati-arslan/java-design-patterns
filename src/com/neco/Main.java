package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setState(5);
        subject.setState(10);

        subject.detach(observer1);
        subject.setState(15);
    }
}
