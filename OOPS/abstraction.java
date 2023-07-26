package OOPS;

// Abstraction is a fundamental concept in Object-Oriented Programming (OOP). It allows us to create a blueprint
// for objects without providing a complete implementation. Abstract classes and interfaces are used to define
// abstraction in Java. Abstract classes can have abstract methods (without implementation) and concrete methods
// (with implementation), while interfaces can only have abstract method declarations.

// Abstract class representing an Animal
abstract class Animal {
    abstract void walk(); // Abstract method representing how the animal walks

    abstract void breathe(); // Abstract method representing how the animal breathes
}

// Concrete class Horse extending Animal
class Horse extends Animal {

    Horse() {
        System.out.println("You have created a Horse");
    }

    void walk() {
        System.out.println("This animal walks on four legs"); // Implementation of walk() specific to Horse
    }

    void breathe() {
        System.out.println("This animal breathes air"); // Implementation of breathe() specific to Horse
    }
}

// Concrete class Chicken extending Animal
class Chicken extends Animal {

    Chicken() {
        System.out.println("You have created a Chicken");
    }

    void walk() {
        System.out.println("This animal walks on two legs"); // Implementation of walk() specific to Chicken
    }

    void breathe() {
        System.out.println("This animal breathes air"); // Implementation of breathe() specific to Chicken
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse(); // Creating an instance of Horse
        horse.walk(); // Calling the walk() method specific to Horse
        horse.breathe(); // Calling the breathe() method specific to Horse

        Chicken chicken = new Chicken(); // Creating an instance of Chicken
        chicken.breathe(); // Calling the breathe() method specific to Chicken
        chicken.walk(); // Calling the walk() method specific to Chicken
    }
}
