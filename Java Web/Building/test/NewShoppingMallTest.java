/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import building.NewShoppingMall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//package building;

/**
 *
 * @author myLaptop
 */
public class NewShoppingMallTest {
    @Test
    public void testShoppingMallWaterConsumption() {
        NewShoppingMall shoppingMall = new NewShoppingMall(10000, true, 5000, 2000,
                "Fibre glass", true, 1000, 50, 500);
        Assertions.assertDoesNotThrow(() -> shoppingMall.waterConsumption());
    }

    @Test
    public void testShoppingMallElectricityUse() {
        NewShoppingMall shoppingMall = new NewShoppingMall(10000, true, 5000, 2000,
                "Fibre glass", true, 1000, 50, 500);
        Assertions.assertDoesNotThrow(() -> shoppingMall.electricityUse());
    }

    @Test
    public void testShoppingMallElectricityUsePerShop() {
        NewShoppingMall shoppingMall = new NewShoppingMall(10000, true, 5000, 2000,
                "Fibre glass", true, 1000, 50, 500);
        Assertions.assertDoesNotThrow(() -> shoppingMall.electricityUsePerShop());
    }
}
