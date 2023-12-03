public class Manager extends Employee {
    private int travelledDays;
    private int newClients;

    public Manager(String name, int birthYear, double monthlyIncome, double occupationRate, int travelledDays, int newClients) {
        super(name, birthYear, monthlyIncome, occupationRate);
        System.out.println("We have a new employee: " + name + ", a manager.");
        this.travelledDays = travelledDays;
        this.newClients = newClients;
    }

    @Override
    public double annualIncome() {
        double baseIncome = super.annualIncome();
        return baseIncome + (500 * newClients) + (100 * travelledDays);
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("He/She travelled " + travelledDays + " days and has brought " + newClients + " new clients.");
        System.out.println("His/Her estimated annual income is " + annualIncome());
        displayVehicleInfo();
    }
}


