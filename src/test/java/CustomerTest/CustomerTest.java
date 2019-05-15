package CustomerTest;

import dealership.customers.Customer;
import dealership.vehicales.Car;
import dealership.vehicales.DamageType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before(){
        customer = new Customer("Sally", 10000.00);
        car = new Car("Ford", "Fiesta", "black", 10000);
    }

    @Test
    public void hasName() {
        assertEquals("Sally", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(10000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canSetName() {
        customer.setName("Sandra");
        assertEquals("Sandra", customer.getName());
    }

    @Test
    public void canSetWallet() {
        customer.setWallet(8000.00);
        assertEquals(8000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canDamageVehicle(){
        customer.damageVehicle(car, DamageType.MINOR);
        assertEquals(2, car.getDamage());
        assertEquals(9000, car.getPrice(), 0.01);

    }
}
