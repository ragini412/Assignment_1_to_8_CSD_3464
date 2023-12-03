public class Tester extends Employee {
    private int bugsSolved;

    public Tester(String name, int birthYear, double monthlyIncome, double occupationRate, int bugsSolved) {
        super(name, birthYear, monthlyIncome, occupationRate);
        System.out.println("We have a new employee: " + name + ", a tester.");
        this.bugsSolved = bugsSolved;
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        return baseIncome + (10 * bugsSolved);
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("He/She corrected " + bugsSolved + " bugs.");
        System.out.println("His/Her estimated annual income is " + annualIncome());
        displayVehicleInfo();
    }
}


