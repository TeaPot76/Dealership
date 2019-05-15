package dealership.vehicales;

import dealership.interfaces.IComponent;
import dealership.interfaces.IDrive;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements IDrive {
    private String make;
    private String model;
    private String color;
    private double price;
    private List<IComponent> components;
    private int damage;

    public Vehicle(String make, String model, String color, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.components = new ArrayList<>();
        this.damage = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public List<IComponent> getComponents() {
        return components;
    }

    public int getDamage() {
        return damage;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComponents(List<IComponent> components) {
        this.components = components;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String drive(){
        return "I am driving ";
    }
}
