package OOPS;

// Define the 'Gagets' interface with a single method 'gagetFun'.
interface Gagets {
    void gagetFun(String fun);
}

// Define the 'Electronic' interface with a single method 'price'.
interface Electronic {
    void price(int n);
}

// Create a class 'Laptop' that implements both 'Gagets' and 'Electronic'
// interfaces.
// this is known as multiple inheritance
class Laptop implements Gagets, Electronic {
    String name;

    // Implement the 'gagetFun' method from the 'Gagets' interface.
    @Override
    public void gagetFun(String fun) {
        System.out.println("this function of this " + name + " laptop is " + fun);
    }

    // Implement the 'price' method from the 'Electronic' interface.
    @Override
    public void price(int n) {
        System.out.println("the price of this " + name + " is " + n);
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        // Create an instance of the 'Laptop' class.
        Laptop l1 = new Laptop();

        // Set the name of the laptop.
        l1.name = "HP Pavilion";

        // Call the 'gagetFun' method to display the functions of the laptop.
        l1.gagetFun("Coding, Gaming, Trading, Browsing etc.");

        // Call the 'price' method to display the price of the laptop.
        l1.price(56000);
    }
}
