class User {
    int id;
    String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        // Assuming there are 12 months in a year
        return salary * 12;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee employee = new Employee(1, "John", 20000);

        // Calculate the annual salary
        double annualSalary = employee.calculateAnnualSalary();

        // Display the result
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Monthly Salary: $" + employee.salary);
        System.out.println("Annual Salary: $" + annualSalary);
    }
}
