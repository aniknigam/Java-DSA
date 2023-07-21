package OOPS;

// Create a class named Employee
class Employee {
    // Instance variables to store employee name and salary
    String name;
    int salary;

    // Parameterized constructor to initialize employee details
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Copy constructor to create a new Employee object with the same details as an
    // existing Employee object
    // This constructor takes a reference to an existing Employee object and copies
    // its details to create a new Employee object.
    Employee(Employee ref) {
        this.name = ref.name;
        this.salary = ref.salary;
    }

    // Method to print employee information
    public void printInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        // Create an Employee object using the parameterized constructor
        Employee e1 = new Employee("Aniket", 284383);

        // Create a new Employee object (e2) using the copy constructor and passing the
        // reference of e1
        // The copy constructor allows us to create a new Employee object (e2) with the
        // same details as e1.
        Employee e2 = new Employee(e1);

        // Display employee information using the printInfo() method
        System.out.println("Employee Information of e2");
        e2.printInfo();
    }
}
