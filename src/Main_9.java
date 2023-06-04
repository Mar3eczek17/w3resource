import java.time.LocalDate;
import java.time.Period;

class EmploYee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public EmploYee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }
    public void printEmploYeeDetails() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(hireDate);
    }
}
public class Main_9 {
    public static void main(String[] args) {
        EmploYee emploYee1 = new EmploYee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        EmploYee emploYee2 = new EmploYee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        EmploYee emploYee3 = new EmploYee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
        emploYee1.printEmploYeeDetails();
        System.out.println(emploYee1.getYearsOfService());
        emploYee2.printEmploYeeDetails();
        System.out.println(emploYee2.getYearsOfService());
        emploYee3.printEmploYeeDetails();
        System.out.println(emploYee3.getYearsOfService());
    }
}
