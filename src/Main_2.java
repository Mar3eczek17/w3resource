public class Main_2 {
    public static void main(String[] args) {
        // Create an instance of the Dog class and set attributes using the constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        System.out.println(dog1.getName() + ' ' + dog1.getBreed());
        System.out.println(dog2.getName() + ' ' + dog2.getBreed());

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        System.out.println(dog1.getName() + ' ' + dog1.getBreed());
        System.out.println(dog2.getName() + ' ' + dog2.getBreed());
    }
}
