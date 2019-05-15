package VehicleTest;

import dealership.vehicales.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Citreon", "Grace", "green", 7000.00);
    }

    @Test
    public void hasMake() {
        assertEquals("Citreon", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Grace", car.getModel());
    }

    @Test
    public void hasColor() {
        assertEquals("green", car.getColor());
    }

    @Test
    public void hasPrice() {
        assertEquals(7000.00, car.getPrice(), 0.01);
    }

    @Test
    public void canSetMake() {
        car.setMake("Ford");
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void canSetModel() {
        car.setModel("Mondeo");
        assertEquals("Mondeo", car.getModel());
    }

    @Test
    public void canSetColor() {
        car.setColor("blue");
        assertEquals("blue", car.getColor());
    }

    @Test
    public void canSetPrice() {
        car.setPrice(8000.00);
        assertEquals(8000.00, car.getPrice(), 0.01);
    }

    @Test
    public void canDrive() {
        assertEquals("I am driving ", car.drive());
    }
}
