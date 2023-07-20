package OOPS;

//we have created a Pen Class and in this we will have a blue print of the pen. We will define the properties of a pen
class Pen {
    // defining properties
    String color; // color property
    String type; // type property such as ballpoint pen or gel pen

    // defining methods for pen class
    // pen can write so we will create method for that

    public void write() {
        System.out.println("writing...");
    }

    // creating method for printing the color of the pen
    public void penColor() {
        System.out.println(this.color);
    }
}

// one public class is needed to have in each java file
// main function comes inside public class
public class example1 {
    public static void main(String[] args) {
        // creating object
        // Pen -is the name of the class we defined earlier. It serves as the blueprint
        // or template for creating pen objects.
        // pen1- is the name of the object
        // new -keyword means we are initilization some space in the memory for pen1
        // Pen()-This is the constructor of the Pen class. Constructors are special
        // methods used to initialize the state of an object when it is created.
        Pen pen1 = new Pen();
        // here we are accessing the property of the Pen class
        pen1.color = "blue";
        pen1.type = "gel pen";

        // here we are accessing the method of the Pen Class
        pen1.write();
        pen1.penColor();
        // output
        // writing...
        // blue

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint pen";

        pen2.write();
        pen2.penColor();
        // output
        // writing...
        // black
    }
}
