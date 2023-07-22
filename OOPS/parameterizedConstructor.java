package OOPS;

// Create a class named Car
class Car {

    // Instance variables to store the car model and color
    String model;
    String color;

    // Constructor
    // This is the constructor of the Car class.
    // It takes two parameters: 'model' and 'color', and is automatically called
    // when a Car object is created.
    // The constructor initializes the object's state with the provided model and
    // color.
    Car(String model, String color) {
        this.model = model;
        this.color = color;

        // Print the model and color of the car for demonstration purposes
        System.out.println(this.model + " " + this.color);
    }
}

// Main class
public class parameterizedConstructor {
    public static void main(String[] args) {

        // Create a Car object using the constructor and provide the model and color as
        // arguments.
        // The constructor will be automatically called during object creation to
        // initialize the object's state.
        Car c1 = new Car("electric", "black");
        // output
        // electric black
    }
}
