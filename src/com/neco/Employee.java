package com.neco;



abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 50000; // Fixed salary for full-time employee
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 20 * 8 * 10; // Hourly rate * hours worked per day * working days
    }
}

