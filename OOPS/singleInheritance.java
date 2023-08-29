package OOPS;

// Super class representing a general shape
class Shape {
    public String color;
    public String border;

    // Method to display information about the shape's color and border
    public void info() {
        System.out.println("Color is " + this.color + " and border is " + this.border);
    }

    // Method to display a general property of any shape
    public void property() {
        System.out.println("Anything in this world is a shape.");
    }
}

// Subclass representing a triangle, inheriting from the Shape class
class Triangle extends Shape {
    // Method to calculate and display the area of the triangle
    public void area(int base, int height) {
        System.out.println("Area of the triangle: " + 0.5 * base * height);

    }
}

public class singleInheritance {
    public static void main(String[] args) {
        // Create an instance of the Triangle class
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        // Set properties for the triangle
        t1.color = "blue";
        t1.border = "dotted";

        // Call the info() method to display the shape's color and border
        t1.info();

        // Call the property() method to display a general property of shapes
        t1.property();

        // Call the area() method to calculate and display the area of the triangle
        int base = 32;
        int height = 2;
        t1.area(base, height);

    }
}
