package OOPS;

// Create a class named Hello
class Hello {

    // Constructor
    // This is the constructor of the Hello class.
    // It is automatically called when an object of the Hello class is created using
    // the 'new' keyword.
    // Constructors are used to initialize the object's state and perform any
    // necessary setup.
    Hello() {
        System.out.println("Constructor Called");
    }

    public void greet() {
        System.out.println("say hello");
    }
}

// Main class
public class constructorPL {
    public static void main(String[] args) {

        // Create an object of the Hello class using the default constructor.
        // The constructor will be automatically called during object creation.
        Hello h1 = new Hello();
        // output
        // Constructor Called
        h1.greet();

    }
}
