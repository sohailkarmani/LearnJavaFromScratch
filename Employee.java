
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = (percent / 100) * salary;
            salary += raiseAmount;
        } else {
            System.out.println("Invalid percentage. Salary not increased.");
        }
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Example usage of the Employee class
        Employee employee = new Employee(1, "John Doe", 50000.0);
        employee.displayInfo();

        // Raise salary by 10%
        employee.raiseSalary(50);
        System.out.println("After raised salary");
        employee.displayInfo();
    }
}
