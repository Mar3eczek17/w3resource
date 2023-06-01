class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main_1 {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person1 = new Person("Marek", 32);
        Person person2 = new Person("Karol", 21);

        // sout
        System.out.println(person1.getName() + " " + person1.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
    }
}


