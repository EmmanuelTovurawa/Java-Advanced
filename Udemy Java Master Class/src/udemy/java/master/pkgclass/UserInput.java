/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemy.java.master.pkgclass;
import java.util.Scanner;
/**
 *
 * @author Manex
 */
public class UserInput {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + " : ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }  
}
