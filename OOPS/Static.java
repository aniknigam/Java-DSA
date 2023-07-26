package OOPS;

// Defining a class 'Information' within the 'OOPS' package

// Class 'Information' with a static variable 'School' and an instance variable 'name'
class Information {
    static String School; // Static variable to store the school name (shared among all instances)
    String name; // Instance variable to store individual names
}

// Main class 'Static' to demonstrate the use of static variables
public class Static {
    public static void main(String[] args) {
        Information.School = "lps"; // Setting the 'School' variable to "lps"

        Information s1 = new Information(); // Creating the first instance of 'Information'
        Information s2 = new Information(); // Creating the second instance of 'Information'

        System.out.println(s1.School); // Printing the value of 'School' for the first instance
        System.out.println(s2.School); // Printing the value of 'School' for the second instance

        // Output:
        // lps
        // lps
    }
}
