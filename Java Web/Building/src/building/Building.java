/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package building;

/**
 *
 * @author myLaptop
 */
public class Building {
    protected int size;
    protected boolean multiStorey;
    protected int myWindows;
    protected int nrDoors;
    protected String roofType;

    public Building(int size, boolean multiStorey, int myWindows, int nrDoors, String roofType) {
        this.size = size;
        this.multiStorey = multiStorey;
        this.myWindows = myWindows;
        this.nrDoors = nrDoors;
        this.roofType = roofType;
    }

    public void waterConsumption() {
        System.out.println("Every building has water consumption");
    }

    public void electricityUse() {
        System.out.println("Every building has electricity consumption");
    }
}
