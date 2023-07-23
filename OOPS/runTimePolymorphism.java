package OOPS;

class Shape {
    void draw() {
        System.out.println("Can't say the shape type");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Circle Drawing");
    }
}

public class runTimePolymorphism {
    public static void main(String[] args) {
        // Run-time polymorphism example:
        // The reference variable 's' is declared of type 'Circle', but it is pointing
        // to an object of 'Circle'.
        // During run-time, Java will dynamically determine the actual type of the
        // object and invoke its specific 'draw' method.
        // Since the 'draw' method is overridden in the 'Circle' class, the specific
        // 'draw' method of 'Circle' will be called, not the one in 'Shape'.
        Circle s = new Circle();
        s.draw(); // Output: "Circle Drawing"
    }
}
