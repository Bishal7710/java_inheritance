class Employee {
    String name;
    int employeeId;
    double salary;

    // Constructor
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

    // Method to calculate salary
    double calculateSalary() {
        return salary;
    }
}