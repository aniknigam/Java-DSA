package OOPS;

// Superclass
class Animal {

    // This method prints "Animal is eating".
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// This is the subclass Dog, which inherits from Animal.
class Dog extends Animal {

    // This method overrides the eat() method in Animal and prints "Dog is eating".
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// This is the subclass Cat, which inherits from Animal.
class Cat extends Animal {

    // This method overrides the eat() method in Animal and prints "Cat is eating".
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

// This is the main class.
public class runTimePolymorphismex2 {

    // This method creates a Dog object and assigns it to the animal variable.
    public static void main(String[] args) {
        Animal animal = new Dog();

        // This line prints "Dog is eating" because the eat() method in Dog is called.
        animal.eat();

        // This line creates a Cat object and assigns it to the animal variable.
        animal = new Cat();

        // This line prints "Cat is eating" because the eat() method in Cat is called.
        animal.eat();
    }
}
