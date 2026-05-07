class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    // Constructor
    PartTimeEmployee(String name, int employeeId, int hoursWorked, double hourlyRate) {
        super(name, employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Override salary calculation
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Display details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Part Time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println();
    }
}