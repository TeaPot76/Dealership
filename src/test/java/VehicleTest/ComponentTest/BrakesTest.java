package VehicleTest.ComponentTest;

import dealership.vehicales.components.Brakes;
import dealership.vehicales.components.SteeringWheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrakesTest {

    Brakes brakes;

    @Before
    public void before(){
        brakes = new Brakes("Supermax");
    }

    @Test
    public void hasName() {
        assertEquals("Supermax", brakes.getName());
    }

    @Test
    public void canSetName() {
        brakes.setName("Turbo");
        assertEquals("Turbo", brakes.getName());
    }
}
