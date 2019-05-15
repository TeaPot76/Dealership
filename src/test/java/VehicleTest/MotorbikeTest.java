package VehicleTest;

import dealership.vehicales.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike;

    @Before
    public void before(){
        motorbike = new Motorbike("Citreon", "Grace", "green", 7000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Citreon", motorbike.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Grace", motorbike.getModel());
    }

    @Test
    public void hasColor() {
        assertEquals("green", motorbike.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(7000.00, motorbike.getPrice(), 0.01);
    }

    @Test
    public void canSetMake() {
        motorbike.setMake("Ford");
        assertEquals("Ford", motorbike.getMake());
    }

    @Test
    public void canSetModel() {
        motorbike.setModel("Mondeo");
        assertEquals("Mondeo", motorbike.getModel());
    }

    @Test
    public void canSetColor() {
        motorbike.setColor("blue");
        assertEquals("blue", motorbike.getColor());
    }

    @Test
    public void canSetPrice() {
        motorbike.setPrice(8000.00);
        assertEquals(8000.00, motorbike.getPrice(), 0.01);
    }

    @Test
    public void canDrive() {
        assertEquals("I am driving ", motorbike.drive());
    }
}
