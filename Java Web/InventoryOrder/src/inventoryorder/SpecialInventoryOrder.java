/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryorder;

/**
 *
 * @author myLaptop
 */
public class SpecialInventoryOrder extends InventoryOrder {
    public SpecialInventoryOrder(String itemCode, String itemDescription, String supplierName,
                                 int dailyUnitsSold, int supplierLeadTime, int productRanking) {
        super(itemCode, itemDescription, supplierName, dailyUnitsSold, supplierLeadTime, productRanking);
    }

    @Override
    public double calculateReorderTotal() {
        return (dailyUnitsSold * supplierLeadTime) + (dailyUnitsSold * (productRanking * 0.05));
    }
}
