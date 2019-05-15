package DealershipTest;

import dealership.Dealership;
import dealership.customers.Customer;
import dealership.interfaces.IDrive;
import dealership.vehicales.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Motorbike motorbike;
    ElectricCar electricCar;
    Customer customer;
    HybridCar hybridCar;



    @Before
    public void before(){
        dealership = new Dealership("CodeClan Cars", 20000.00);
        car = new Car("Citreon", "Grace", "green", 7000.00);
        motorbike = new Motorbike("Harley Davidson", "Grace", "green", 10000.00);
        electricCar = new ElectricCar("Honda", "Grace", "green", 8000.00);
        hybridCar = new HybridCar("Toyota", "Hybrid", "red", 12000);
        customer = new Customer("Ben", 9000.00);
        dealership.addVehicle(motorbike);
        dealership.addVehicle(car);
        dealership.addVehicle(electricCar);

    }

    @Test
    public void getName() {
        assertEquals("CodeClan Cars", dealership.getName());
    }

    @Test
    public void getTill() {
        assertEquals(20000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void getiDrives() {
        assertEquals(3, dealership.countIDrives());
    }

    @Test
    public void setName() {
        dealership.setName("CodeClan Motors");
        assertEquals("CodeClan Motors", dealership.getName());
    }

    @Test
    public void setTill() {
        dealership.setTill(30000);
        assertEquals(30000, dealership.getTill(), 0.01);
    }



    @Test
    public void canAddVehicles() {
        assertEquals(3, dealership.countIDrives());
    }

    @Test
    public void canSellVehicles() {
        dealership.sellVehicle(electricCar, customer);
        assertEquals(2, dealership.countIDrives());
        assertEquals(1, customer.vehicles.size());
        assertEquals(28000, dealership.getTill(), 0.01);
        assertEquals(1000, customer.getWallet(), 0.01);

    }

    @Test
    public void cannotSellVehicleNotEnoughMoney() {
        dealership.sellVehicle(motorbike, customer);
        assertEquals(3, dealership.countIDrives());
        assertEquals(0, customer.vehicles.size());
        assertEquals(20000, dealership.getTill(), 0.01);
        assertEquals(9000, customer.getWallet(), 0.01);

    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(hybridCar);
        assertEquals(4, dealership.countIDrives());
        assertEquals(8000, dealership.getTill(), 0.01);
    }
}
