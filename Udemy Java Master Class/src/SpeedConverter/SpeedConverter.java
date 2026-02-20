/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpeedConverter;

/**
 *
 * @author Manex
 */
public class SpeedConverter {
       public static long toMilesPerHour(double kilometresPerHour) {

        if (kilometresPerHour < 0) {
            return -1;
        }

        long milesPerHour = Math.round(kilometresPerHour / 1.609);
        return milesPerHour;
    }

    public static void ptintConverstion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h= " + milesPerHour +
                    " mi/h");
        }
    } 
}
