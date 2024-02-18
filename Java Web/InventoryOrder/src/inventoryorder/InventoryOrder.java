/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventoryorder;

/**
 *
 * @author myLaptop
 */
public class InventoryOrder {

    protected String itemCode;
    protected String itemDescription;
    protected String supplierName;
    protected int dailyUnitsSold;
    protected int supplierLeadTime;
    protected int productRanking;

    public InventoryOrder(String itemCode, String itemDescription, String supplierName,
                          int dailyUnitsSold, int supplierLeadTime, int productRanking) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.supplierName = supplierName;
        this.dailyUnitsSold = dailyUnitsSold;
        this.supplierLeadTime = supplierLeadTime;
        this.productRanking = productRanking;
    }

    public double calculateReorderTotal() {
        return (dailyUnitsSold * supplierLeadTime) + (dailyUnitsSold * (productRanking * 0.025));
    }
    
}
