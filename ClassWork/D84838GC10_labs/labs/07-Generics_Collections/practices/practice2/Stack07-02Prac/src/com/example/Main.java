/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Manex
 */
public class Main {

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("After pushing 5 elements: "
                + stack);
        int element = stack.pop();
        System.out.println("Popped element = " + element);
        System.out.println("After popping 1 element : "
                + stack);
        int top = stack.peek();
        System.out.println("Peeked element = " + top);
        System.out.println("After peeking 1 element : "
                + stack);
    }

}
