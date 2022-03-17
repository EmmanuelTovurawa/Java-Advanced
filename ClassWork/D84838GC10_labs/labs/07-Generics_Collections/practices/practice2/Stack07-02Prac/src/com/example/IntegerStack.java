package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void push(Integer element) {
        data.addFirst(element);
    }

    public Integer pop() {
        if (data.isEmpty()) {
            System.out.print("Stack is empty");
        }
        return data.removeFirst();
    }

    public Integer peek() {
        return data.peekFirst();
    }

    public String toString() {
        return data.toString();
    }
}
