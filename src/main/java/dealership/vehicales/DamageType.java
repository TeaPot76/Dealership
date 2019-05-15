package dealership.vehicales;

public enum DamageType {
    MINOR(2),
    SERIOUS(4),
    MAJOR(6);


    private final int value;

    DamageType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
