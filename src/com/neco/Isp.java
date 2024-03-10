package com.neco;

//The Interface Segregation Principle (ISP)
// It states that clients should not be forced to depend on interfaces they don't use.
// Instead of having large, monolithic interfaces, it's better to have smaller, specific interfaces that are tailored to the needs of the clients.

public class Isp {
}

// Printable.java
 interface Printable {
    void print();
}

// Scanable.java
 interface Scanable {
    void scan();
}

// Faxable.java
 interface Faxable {
    void fax();
}

// TextDocument.java
 class TextDocument implements Printable {
    @Override
    public void print() {
        System.out.println("Printing text document...");
    }
}

// MultimediaDocument.java
 class MultimediaDocument implements Printable, Scanable, Faxable {
    @Override
    public void print() {
        System.out.println("Printing multimedia document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning multimedia document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing multimedia document...");
    }
}

//To adhere to the Interface Segregation Principle, we should refactor our design to have smaller, more focused interfaces. Here's how we can do that:



//Here's an example of how we might initially design our system without considering the Interface Segregation Principle:




/*
* // Document.java
public interface Document {
    void print();
    void scan();
    void fax();
}

// TextDocument.java
public class TextDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing text document...");
    }

    @Override
    public void scan() {
        // Not supported for text documents
        throw new UnsupportedOperationException("Scanning not supported for text document");
    }

    @Override
    public void fax() {
        // Not supported for text documents
        throw new UnsupportedOperationException("Faxing not supported for text document");
    }
}

// MultimediaDocument.java
public class MultimediaDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing multimedia document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning multimedia document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing multimedia document...");
    }
}

* */