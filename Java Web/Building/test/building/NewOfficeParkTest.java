/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import building.NewOfficePark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//package building;

/**
 *
 * @author myLaptop
 */
public class NewOfficeParkTest {
    @Test
    public void testOfficeParkWaterConsumption() {
        NewOfficePark officePark = new NewOfficePark(1000, false, 500, 200, "Steel",
                false, 100, 10, 3);
        Assertions.assertDoesNotThrow(() -> officePark.waterConsumption());
    }

    @Test
    public void testOfficeParkElectricityUse() {
        NewOfficePark officePark = new NewOfficePark(1000, false, 500, 200, "Steel",
                false, 100, 10, 3);
        Assertions.assertDoesNotThrow(() -> officePark.electricityUse());
    }

    @Test
    public void testOfficeParkOfficeSpaceDesign() {
        NewOfficePark officePark = new NewOfficePark(1000, false, 500, 200, "Steel",
                false, 100, 10, 3);
        Assertions.assertDoesNotThrow(() -> officePark.officeSpaceDesign());
    }
}