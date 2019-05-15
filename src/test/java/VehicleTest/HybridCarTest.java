package VehicleTest;

import dealership.vehicales.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar("Citreon", "Grace", "green", 7000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Citreon", hybridCar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Grace", hybridCar.getModel());
    }

    @Test
    public void hasColor() {
        assertEquals("green", hybridCar.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(7000.00, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canSetMake() {
        hybridCar.setMake("Ford");
        assertEquals("Ford", hybridCar.getMake());
    }

    @Test
    public void canSetModel() {
        hybridCar.setModel("Mondeo");
        assertEquals("Mondeo", hybridCar.getModel());
    }

    @Test
    public void canSetColor() {
        hybridCar.setColor("blue");
        assertEquals("blue", hybridCar.getColor());
    }

    @Test
    public void canSetPrice() {
        hybridCar.setPrice(8000.00);
        assertEquals(8000.00, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canDrive() {
        assertEquals("I am driving ", hybridCar.drive());
    }
}
