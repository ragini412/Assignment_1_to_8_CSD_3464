public class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        this.monthlyIncome = monthlyIncome;
        System.out.println("We have a new employee: " + name + ", an employee.");
    }

    public int getAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public double annualIncome() {
        return 12 * monthlyIncome * occupationRate;
    }

    public void displayEmployeeInfo() {
        System.out.println("-------------------------");
        System.out.println("Name: " + name + ", an Employee");
        System.out.println("Age: " + getAge());
        System.out.println("Employee has an Occupation rate: " + occupationRate * 100 + "%");
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void displayVehicleInfo() {
        if (vehicle != null) {
            System.out.println("Employee has a vehicle");
            System.out.println("- make: " + vehicle.getMake());
            System.out.println("- plate: " + vehicle.getPlate());
            System.out.println("- color: " + vehicle.getColor());
            System.out.println("- category: " + vehicle.getCategory());
        }
    }

    
}

