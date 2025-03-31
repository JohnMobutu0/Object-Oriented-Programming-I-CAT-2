public class PolymorphismDemo {
    public void demonstrateAnimalSounds() {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Dog barks.
        myCat.makeSound(); // Outputs: Cat meows.
    }
}