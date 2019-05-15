package dealership;

import dealership.customers.Customer;
import dealership.interfaces.IDrive;
import dealership.vehicales.ElectricCar;
import dealership.vehicales.HybridCar;
import dealership.vehicales.Motorbike;
import dealership.vehicales.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private List<IDrive> iDrives;
    private double till;

    public Dealership(String name, double till) {
        this.name = name;
        this.iDrives = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public List<IDrive> getiDrives() {
        return iDrives;
    }

    public double getTill() {
        return till;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addVehicle(IDrive iDrive) {
        iDrives.add(iDrive);
    }

    public int countIDrives(){
        return iDrives.size();
    }

    public void sellVehicle(IDrive iDrive, Customer customer) {
        double iDrivePrice = ((Vehicle) iDrive).getPrice();
        if (customer.getWallet() >= iDrivePrice) {
            iDrives.remove(iDrive);
            customer.addVehicle((Vehicle) iDrive);
            customer.takeMoneyFromWallet(iDrivePrice);
            till += iDrivePrice;
        }
    }

    public void buyVehicle(IDrive iDrive) {
        double iDrivePrice = ((Vehicle) iDrive).getPrice();
        if(till >= iDrivePrice) {
            iDrives.add(iDrive);
            till -= iDrivePrice;
        }
    }
}
