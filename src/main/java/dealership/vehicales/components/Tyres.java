package dealership.vehicales.components;

import dealership.interfaces.IComponent;

public class Tyres implements IComponent {
    private String name;

    public Tyres(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
