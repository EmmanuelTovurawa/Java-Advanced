/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import com.example.domain.Employee;

/**
 *
 * @author Manex
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Jane Smith");
        emp.setSSN("012-34-5678");
        emp.setSalary(120_345.27);
        System.out.println(emp.name);
    }

}
