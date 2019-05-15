package VehicleTest.ComponentTest;

import dealership.vehicales.components.Engine;
import dealership.vehicales.components.SteeringWheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SteeringWheelTest {

    SteeringWheel steeringWheel;

    @Before
    public void before(){
        steeringWheel = new SteeringWheel("Supermax");
    }

    @Test
    public void hasName() {
        assertEquals("Supermax", steeringWheel.getName());
    }

    @Test
    public void canSetName() {
        steeringWheel.setName("Turbo");
        assertEquals("Turbo", steeringWheel.getName());
    }
}
