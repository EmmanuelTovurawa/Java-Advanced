/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package building;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author myLaptop
 */
public class BuildingTest {
    @Test
    public void testBuildingWaterConsumption() {
        Building building = new Building(2000, true, 500, 100, "Tile");
        Assertions.assertDoesNotThrow(() -> building.waterConsumption());
    }

    @Test
    public void testBuildingElectricityUse() {
        Building building = new Building(2000, true, 500, 100, "Tile");
        Assertions.assertDoesNotThrow(() -> building.electricityUse());
    }
}