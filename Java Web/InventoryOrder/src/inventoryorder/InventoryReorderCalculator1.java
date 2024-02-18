/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryorder;

import java.util.Scanner;

/**
 *
 * @author myLaptop
 */
public class InventoryReorderCalculator1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter product description: ");
        String itemDescription = scanner.nextLine();
        System.out.print("Enter supplier name: ");
        String supplierName = scanner.nextLine();
        System.out.print("Enter daily product units sold: ");
        int dailyUnitsSold = scanner.nextInt();
        System.out.print("Enter supplier lead time (in days): ");
        int supplierLeadTime = scanner.nextInt();
        System.out.print("Enter product popularity (ranked out of 5): ");
        int productRanking = scanner.nextInt();

        InventoryOrder order = new InventoryOrder(itemCode, itemDescription, supplierName,
                dailyUnitsSold, supplierLeadTime, productRanking);

        System.out.println("\nEntered input:");
        System.out.println("Product Code: " + order.itemCode);
        System.out.println("Product Description: " + order.itemDescription);
        System.out.println("Supplier Name: " + order.supplierName);
        System.out.println("Daily Product Units Sold: " + order.dailyUnitsSold);
        System.out.println("Supplier Lead Time: " + order.supplierLeadTime + " days");
        System.out.println("Product Ranking: " + order.productRanking);

        System.out.println("\nReorder Total: $" + order.calculateReorderTotal());
    }
}
