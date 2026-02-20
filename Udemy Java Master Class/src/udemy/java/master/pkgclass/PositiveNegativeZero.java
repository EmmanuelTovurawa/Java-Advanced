/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.java.master.pkgclass;

/**
 *
 * @author Manex
 */
public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if(number == 0) {
            System.out.println("Zero");
        }
    }
}
