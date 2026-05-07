public class Main {
    public static void main(String[] args) {

        // Full-time employee object
        FullTimeEmployee emp1 =
                new FullTimeEmployee("Rahul", 101, 50000, 10000);

        // Part-time employee object
        PartTimeEmployee emp2 =
                new PartTimeEmployee("Aman", 102, 80, 500);

        // Display details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}