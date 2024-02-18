/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package building;

/**
 *
 * @author myLaptop
 */
public class NewOfficePark extends Building {
    private boolean underGroundParking;
    private int nrParkingBays;
    private int nrRestRooms;
    private int nrBoardRooms;

    public NewOfficePark(int size, boolean multiStorey, int myWindows, int nrDoors, String roofType,
                         boolean underGroundParking, int nrParkingBays, int nrRestRooms, int nrBoardRooms) {
        super(size, multiStorey, myWindows, nrDoors, roofType);
        this.underGroundParking = underGroundParking;
        this.nrParkingBays = nrParkingBays;
        this.nrRestRooms = nrRestRooms;
        this.nrBoardRooms = nrBoardRooms;
    }

    public void officeSpaceDesign() {
        System.out.println("Only offices require office space design");
    }
}
