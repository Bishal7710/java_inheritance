class FullTimeEmployee extends Employee {
    double bonus;

    // Constructor
    FullTimeEmployee(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    // Override salary calculation
    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    // Display details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Full Time");
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println();
    }
}