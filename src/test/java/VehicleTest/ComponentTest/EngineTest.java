package VehicleTest.ComponentTest;

import dealership.vehicales.components.Engine;
import dealership.vehicales.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Supermax");
    }

    @Test
    public void hasName() {
        assertEquals("Supermax", engine.getName());
    }

    @Test
    public void canSetName() {
        engine.setName("Turbo");
        assertEquals("Turbo", engine.getName());
    }
}
