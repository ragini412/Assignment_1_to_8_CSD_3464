public class Programmer extends Employee {
    private int projectsCompleted;

    public Programmer(String name, int birthYear, double monthlyIncome, double occupationRate, int projectsCompleted) {
        super(name, birthYear, monthlyIncome, occupationRate);
        System.out.println("We have a new employee: " + name + ", a programmer.");
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        return baseIncome + (200 * projectsCompleted);
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("He/She completed " + projectsCompleted + " projects.");
        System.out.println("His/Her estimated annual income is " + annualIncome());
        displayVehicleInfo();
    }
}


