package com.neco;

public class Srp {
}

/*

The Single Responsibility Principle (SRP)
Explanation: A class should have only one reason to change, meaning it should have only one responsibility.
* */

 class Employee {
    private String name;
    private double salary;

    // Constructor, getters, setters, and other methods related to employee
}

 class EmployeeDatabaseManager {
    public void saveEmployeeToDatabase(Employee employee) {
        // code to save employee to database
    }

    // other methods related to database management
}

 class SalaryCalculator {
     public double calculateSalary(Employee employee) {
         // code to calculate employee's salary;
         return 10.0;
     }
 }

    // other methods related to salary calculation



/*
 * Consider a class called Employee that handles both employee data storage and employee payroll calculation.
 *  This violates SRP because it has two responsibilities.
 *  We can split it into two classes: EmployeeDataStorage and PayrollCalculator, each handling one responsibility.
 * */