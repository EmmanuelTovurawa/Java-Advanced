/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lowewriter.books;

import java.util.ArrayList;
import java.text.NumberFormat;

/**
 *
 * @author Manex
 */
public class BookCart {

    private ArrayList<Book> cart;
    private NumberFormat cf
            = NumberFormat.getCurrencyInstance();

    public BookCart() {
        cart = new ArrayList<Book>();
    }

    public void setBook(String code) {
        boolean found = false;
        for (Book b : cart) {
            if (b.getCode().equals(code)) {
                b.addQuantity(1);
                found = true;
            }
        }
        if (!found) {
            cart.add(new Book(code));
        }
    }

    public String getList() {
        String list = "<table border=2>";
        list += "<tr><td>Title</td><td>Qty</td>"
                + "<td>Price</td><td>Total</td></tr>";
        double total = 0.0;
        for (Book b : cart) {
            list += "<tr><td>"
                    + b.getTitle() + "</td>"
                    + "<td>" + b.getQuantity() + "</td>"
                    + "<td>" + cf.format(b.getPrice())
                    + "</td>"
                    + "<td>" + cf.format(b.getTotal())
                    + "</td>"
                    + "</tr>";
            total += b.getTotal();
        }
        list += "<tr><td></td><td></td><td>Total:</td>"
                + "<td>" + cf.format(total)
                + "</td></tr>";
        list += "</table>";
        return list;
    }

    private class Book {

        private String code;
        private int quantity;

        public Book(String code) {
            this.code = code;
            this.quantity = 1;
        }

        public String getCode() {
            return this.code;
        }

        public String getTitle() {
            if (code.equals("elecaio")) {
                return "Electronics All-in-One For Dummies";
            } else if (code.equals("netaio")) {
                return "Networking All-in-One For Dummies";
            } else if (code.equals("javaaio")) {
                return "Java All-in-One For Dummies";
            } else {
                return "Unknown book";
            }
        }

        public double getPrice() {
            if (code.equals("elecaio")) {
                return 34.99;
            } else if (code.equals("netaio")) {
                return 22.99;
            } else if (code.equals("javaaio")) {
                return 29.99;
            } else {
                return 0.0;
            }
        }

        public int getQuantity() {
            return this.quantity;
        }

        public void addQuantity(int qty) {
            this.quantity += qty;
        }

        public double getTotal() {
            return this.quantity * this.getPrice();
        }
    }
}
