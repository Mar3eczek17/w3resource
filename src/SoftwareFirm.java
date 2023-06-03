import java.util.ArrayList;
import java.util.List;

class Employee {
    protected String name;
    protected double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class Manager extends Employee {
    private List<Employee> subordinates;

    public Manager(String name, double monthlySalary) {
        super(name, monthlySalary);
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public double getMonthlySalary() {
        double totalSalary = monthlySalary;
        for (Employee subordinate : subordinates) {
            totalSalary += subordinate.getMonthlySalary();
        }
        return totalSalary;
    }
}

public class SoftwareFirm {
    public static void main(String[] args) {
        // Create employees
        Employee employee1 = new Employee("John", 5000);
        Employee employee2 = new Employee("Jane", 4000);
        Employee employee3 = new Employee("Mark", 6000);

        // Create manager and add employees as subordinates
        Manager manager = new Manager("Mike", 10000);
        manager.addSubordinate(employee1);
        manager.addSubordinate(employee2);
        manager.addSubordinate(employee3);

        // Calculate total monthly salary
        double totalSalary = manager.getMonthlySalary();

        // Display the total monthly salary
        System.out.println("Total monthly salary of all employees: " + totalSalary);
    }
}
