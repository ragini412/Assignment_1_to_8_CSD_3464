public class PermanentEmployee extends Employee implements Contract {
    private int daysWorked;
    private double fixedMonthlySalary;
    private int numberOfChildren;
    private String civilStatus;
    private double childAllowance;

    public PermanentEmployee(String name, int birthYear, double monthlyIncome, double occupationRate,
                             int daysWorked, double fixedMonthlySalary, int numberOfChildren,
                             String civilStatus, double childAllowance) {
        super(name, birthYear, monthlyIncome, occupationRate);
        System.out.println("We have a new employee: " + name + ", a permanent employee.");
        this.daysWorked = daysWorked;
        this.fixedMonthlySalary = fixedMonthlySalary;
        this.numberOfChildren = numberOfChildren;
        this.civilStatus = civilStatus;
        this.childAllowance = childAllowance;
    }

    @Override
    public double annualIncome() {
        double baseIncome = (daysWorked / 20.0) * (fixedMonthlySalary + (numberOfChildren > 0 ? childAllowance * numberOfChildren : 0));
        return baseIncome + super.annualIncome();
    }

    public double accumulatedSalary() {
        return (daysWorked / 20.0) * (fixedMonthlySalary + (numberOfChildren > 0 ? childAllowance * numberOfChildren : 0));
    }
    

    @Override
    public void displayContractInfo() {
        System.out.println("-------------------------");
        System.out.println("Contracts:");
        super.displayEmployeeInfo();
        System.out.println("He/She is " + civilStatus.toLowerCase() + " and he/she has " + numberOfChildren + " children.");
        System.out.println("He/She has worked for " + daysWorked + " days and upon contract his/her monthly salary is " + fixedMonthlySalary + ".");
    }
}

