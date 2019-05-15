package VehicleTest;

import dealership.vehicales.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar("Citreon", "Grace", "green", 7000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Citreon", electricCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Grace", electricCar.getModel());
    }

    @Test
    public void hasColor() {
        assertEquals("green", electricCar.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(7000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canSetMake() {
        electricCar.setMake("Ford");
        assertEquals("Ford", electricCar.getMake());
    }

    @Test
    public void canSetModel() {
        electricCar.setModel("Mondeo");
        assertEquals("Mondeo", electricCar.getModel());
    }

    @Test
    public void canSetColor() {
        electricCar.setColor("blue");
        assertEquals("blue", electricCar.getColor());
    }

    @Test
    public void canSetPrice() {
        electricCar.setPrice(8000.00);
        assertEquals(8000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canDrive() {
        assertEquals("I am driving ", electricCar.drive());
    }
}
