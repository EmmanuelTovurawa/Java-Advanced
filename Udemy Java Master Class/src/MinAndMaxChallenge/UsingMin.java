/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinAndMaxChallenge;

import java.util.Scanner;

/**
 *
 * @author Manex
 */
public class UsingMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = first;
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine(); //handle input
        }

        System.out.println("min= " + min + ", max= " + max);
        scanner.close();
    }
}
