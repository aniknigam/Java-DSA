package OOPS;

// Define the Animal class, which serves as the base class for all animals.
class Animal {

    // Method to represent eating behavior of an animal.
    void eat() {
        System.out.println("animal is eating.");
    }
}

// Define the Dog class, which extends the Animal class and inherits its
// properties.
class Dog extends Animal {

    // Method to represent barking behavior of a dog.
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Define the Labrador class, which extends the Dog class and inherits its
// properties.
class Labrador extends Dog {

    // Method to represent playing behavior of a Labrador.
    void play() {
        System.out.println("Labrador is playing");
    }
}

// The main class to demonstrate multi-level inheritance.
public class multiLevelInheritance {
    public static void main(String[] args) {
        // Create an instance of the Labrador class.
        Labrador tuffy = new Labrador();

        // Call the play() method specific to Labrador class.
        tuffy.play();

        // Call the bark() method inherited from Dog class.
        tuffy.bark();

        // Call the eat() method inherited from Animal class.
        tuffy.eat();
    }
}
