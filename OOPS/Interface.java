package OOPS;

// Interface defining the behavior of a Vehicle
interface Vehicle {
    void changeGear(int a); // Method to change the gear of the vehicle

    void speedUp(int a); // Method to speed up the vehicle

    void applyBreak(int a); // Method to apply brakes to the vehicle
}

// Class representing a Bicycle, which implements the Vehicle interface
class Bicycle implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear; // Set the gear to the new value
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment; // Increase the speed by the specified increment
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement; // Decrease the speed by the specified decrement
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear); // Print the current speed and gear
    }
}

// Class representing a Bike, which also implements the Vehicle interface
class Bike implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear; // Set the gear to the new value
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment; // Increase the speed by the specified increment
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement; // Decrease the speed by the specified decrement
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear); // Print the current speed and gear
    }
}

// Main class to demonstrate the use of the Vehicle interface and classes
public class Interface {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(); // Create a new Bicycle object
        b1.changeGear(1); // Change the gear of the bicycle to 1
        b1.speedUp(4); // Speed up the bicycle by 4 units
        b1.applyBreak(2); // Apply brakes to the bicycle, decreasing the speed by 2 units
        System.out.println("State of b1 is");
        b1.printStates(); // Print the current state of the bicycle (speed and gear)
    }
}
