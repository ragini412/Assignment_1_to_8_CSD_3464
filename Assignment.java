public class Assignment {
    public static void main(String[] args) {
        // Test your classes here
        Manager manager1 = new Manager("Serge", 1989, 6000, 1.0, 4, 30);
        Manager manager2 = new Manager("Cindy", 1978, 5000, 0.8, 6, 20);
        Programmer programmer1 = new Programmer("Paul", 1998, 1000, 0.75, 3);
        Tester tester1 = new Tester("Pierre", 1992, 4000, 0.5, 124);
        Programmer programmer2 = new Programmer("Matt", 1986, 5000, 1.0, 5);
        Programmer programmer3 = new Programmer("Sarah", 1991, 4500, 1.0, 3);

        manager1.displayEmployeeInfo();
        manager1.setVehicle(new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport"));
        manager1.displayVehicleInfo();

        manager2.displayEmployeeInfo();
        manager2.setVehicle(new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan"));
        manager2.displayVehicleInfo();

        programmer1.displayEmployeeInfo();
        programmer1.setVehicle(new Motorcycle("Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle", false));
        programmer1.displayVehicleInfo();

        tester1.displayEmployeeInfo();
        tester1.setVehicle(new Motorcycle("Honda", "Custom Plate", "Black", "Not for Race", true));
        tester1.displayVehicleInfo();

        programmer2.displayEmployeeInfo();
        programmer2.setVehicle(new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV"));
        programmer2.displayVehicleInfo();

        programmer3.displayEmployeeInfo();
        programmer3.setVehicle(new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback"));
        programmer3.displayVehicleInfo();

        System.out.println("-------------------------");

        Contract permanentContract1 = new PermanentEmployee("Serge", 1989, 6000, 1.0, 17, 6000, 2, "Married", 450);
        Contract permanentContract2 = new PermanentEmployee("Cindy", 1978, 5000, 0.8, 19, 5000, 3, "Single", 0);
        Contract temporaryContract1 = new TemporaryEmployee("Paul", 1998, 1000, 0.75, 60.0, 30);
        Contract permanentContract3 = new PermanentEmployee("Pierre", 1992, 4000, 0.5, 20, 4000, 1, "Married", 0);
        Contract temporaryContract2 = new TemporaryEmployee("Matt", 1986, 5000, 1.0, 50.0, 60);
        Contract permanentContract4 = new PermanentEmployee("Sarah", 1991, 4500, 1.0, 19, 4500, 4, "Married", 0);

        ((PermanentEmployee) permanentContract1).displayContractInfo();
        ((PermanentEmployee) permanentContract2).displayContractInfo();
        ((TemporaryEmployee) temporaryContract1).displayContractInfo();
        ((PermanentEmployee) permanentContract3).displayContractInfo();
        ((TemporaryEmployee) temporaryContract2).displayContractInfo();
        ((PermanentEmployee) permanentContract4).displayContractInfo();
    }
}
