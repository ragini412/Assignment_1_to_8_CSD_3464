public class Car extends Vehicle {
    private String gearType;
    private String type;

    public Car(String make, String plate, String color, String category, String gearType, String type) {
        super(make, plate, color, category);
        this.gearType = gearType;
        this.type = type;
    }

    public String getGearType() {
        return gearType;
    }

    public String getType() {
        return type;
    }
}


