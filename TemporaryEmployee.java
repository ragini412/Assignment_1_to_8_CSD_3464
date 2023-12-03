public class TemporaryEmployee extends Employee implements Contract {
    private double hourlyWages;
    private double hoursWorked;

    public TemporaryEmployee(String name, int birthYear, double monthlyIncome, double occupationRate,
                             double hourlyWages, double hoursWorked) {
        super(name, birthYear, monthlyIncome, occupationRate);
        System.out.println("We have a new employee: " + name + ", a temporary employee.");
        this.hourlyWages = hourlyWages;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double annualIncome() {
        return hoursWorked * hourlyWages + super.annualIncome();
    }

    public double accumulatedSalary() {
        return hoursWorked * hourlyWages;
    }

    @Override
    public void displayContractInfo() {
        System.out.println("-------------------------");
        System.out.println("Contracts:");
        super.displayEmployeeInfo();
        System.out.println("He/She is a temporary employee with $" + hourlyWages + " hourly salary and he/she has worked for " + hoursWorked + " hours");
    }
}

