public class Dog {
    private String name; // private = restricted access
    private String breed; // private = restricted access

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
