package OOPS;

// Base class: Employee
class Employees {
    String name;
    String employeeID;

    // Method to display employee information
    void info() {
        System.out.println("Employee name is: " + this.name + " and employee ID is: " + this.employeeID);
    }
}

// Derived class 1: JuniorEmployee (inherits from Employee)
class JuniorEmployee extends Employees {
    int salary;
    String position;

    // Method to display junior employee information
    public void juniorInfo() {
        System.out.println("Salary is: " + this.salary + " position is: " + this.position);
    }
}

// Derived class 2: SeniorEmployee (inherits from Employee)
class SeniorEmployee extends Employees {
    String setMeeting;
    String meetingType;

    // Method to display senior employee meeting information
    public void meetingInfo() {
        System.out.println("Meeting timing is:" + this.setMeeting + " and the meeting type is " + meetingType);
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        // Creating a JuniorEmployee object
        JuniorEmployee employee1 = new JuniorEmployee();
        employee1.name = "Harry";
        employee1.employeeID = "E-8362";
        employee1.info(); // Accessing the base class method to display employee information
        employee1.salary = 80000;
        employee1.position = "Software Engineer";
        employee1.juniorInfo(); // Accessing the derived class method to display junior employee information

        // Creating a SeniorEmployee object
        SeniorEmployee employee2 = new SeniorEmployee();
        employee2.name = "John";
        employee2.employeeID = "E-3847";
        employee2.setMeeting = "At 3:00 pm in the afternoon";
        employee2.meetingType = "Google Meet";
        employee2.meetingInfo(); // Accessing the derived class method to display senior employee meeting
                                 // information

    }
}
