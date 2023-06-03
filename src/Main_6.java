class Employeee {
    private final String name;
    private final String jobTitle;
    private double salary;

    public Employeee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    public void printEmployeeDetails() {
        System.out.println(name);
        System.out.println(jobTitle);
        System.out.println(salary);
    }
}

public class Main_6 {
    public static void main(String[] args) {
        Employeee employeee = new Employeee("Franziska Waltraud", "HR Manager", 40000);
        employeee.printEmployeeDetails();

        employeee.raiseSalary(10);

        employeee.printEmployeeDetails();
    }
}
