package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int id, String name, String ssn, double salary) {
        this.empId = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void raiseSalary(double increase) {
        if (increase > 0) {
            salary += increase;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    public void printEmployee() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + name);
        System.out.println("Employee ssn: " + ssn);
        System.out.println("Employee id: " + salary);
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }

}
