package dealership.customers;

import dealership.interfaces.IDrive;
import dealership.vehicales.Car;
import dealership.vehicales.DamageType;
import dealership.vehicales.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double wallet;
    public List<Vehicle> vehicles;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(double wallet) {

        this.wallet = wallet;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void takeMoneyFromWallet(double iDrivePrice) {
        wallet -= iDrivePrice;
    }

    public void damageVehicle(Vehicle vehicle, DamageType type) {
        int damageValue = type.getValue();
        vehicle.setDamage(damageValue);
        if (type == DamageType.MINOR){
            vehicle.setPrice(vehicle.getPrice()*0.9);
        } else if (type == DamageType.SERIOUS){
            vehicle.setPrice(vehicle.getPrice()*0.8);
        } else if (type == DamageType.MAJOR){
            vehicle.setPrice(vehicle.getPrice()*0.7);
        }

    }
}
