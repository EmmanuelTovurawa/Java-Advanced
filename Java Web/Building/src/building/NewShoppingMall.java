/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package building;

/**
 *
 * @author myLaptop
 */
public class NewShoppingMall extends Building {
    private boolean underGroundParking;
    private int nrParkingBays;
    private int nrRestRooms;
    private int nrShops;

    public NewShoppingMall(int size, boolean multiStorey, int myWindows, int nrDoors, String roofType,
                           boolean underGroundParking, int nrParkingBays, int nrRestRooms, int nrShops) {
        super(size, multiStorey, myWindows, nrDoors, roofType);
        this.underGroundParking = underGroundParking;
        this.nrParkingBays = nrParkingBays;
        this.nrRestRooms = nrRestRooms;
        this.nrShops = nrShops;
    }

    public void electricityUsePerShop() {
        System.out.println("Shopping malls require electricity use per shop");
    }
}
