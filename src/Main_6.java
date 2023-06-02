import java.util.ArrayList;

class Employeee {
    String name;
    String jobTitle;
    int salary;
    private static final ArrayList<Employeee> employeeeCollection = new ArrayList<Employeee>();
    public Employeee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
public class Main_6 {
    Employeee employeee = new Employeee("Karol", "Technique", 3300);
}
