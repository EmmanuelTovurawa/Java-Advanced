/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package building;

/**
 *
 * @author myLaptop
 */
public class Main {
    public static void main(String[] args) {
        NewOfficePark officePark = new NewOfficePark(1000, false, 500, 200,
                "Steel", false, 100, 10, 3);
        officePark.waterConsumption();
        officePark.electricityUse();
        officePark.officeSpaceDesign();

        NewShoppingMall shoppingMall = new NewShoppingMall(10000, true, 5000, 2000,
                "Fibre glass", true, 1000, 50, 500);
        shoppingMall.waterConsumption();
        shoppingMall.electricityUse();
        shoppingMall.electricityUsePerShop();
    }
}
