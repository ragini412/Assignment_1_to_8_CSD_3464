public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, String category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}


