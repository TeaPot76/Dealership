package VehicleTest.ComponentTest;

import dealership.vehicales.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Turbo Tyres");
    }

    @Test
    public void hasName() {
        assertEquals("Turbo Tyres", tyres.getName());
    }

    @Test
    public void canSetName() {
        tyres.setName("Turbo");
        assertEquals("Turbo", tyres.getName());
    }
}
