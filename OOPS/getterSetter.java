package OOPS;

// Myinfo class represents information about a student
class Myinfo {
    // Private fields to store student information
    private String branch; // To store the branch of the student
    private int rollNo; // To store the roll number of the student

    // Setter method to set the branch of the student
    public void setBranch(String b) {
        branch = b;
    }

    // Setter method to set the roll number of the student
    public void setRollNo(int r) {
        rollNo = r;
    }

    // Getter method to retrieve the branch of the student
    public String getBranch() {
        return branch;
    }

    // Getter method to retrieve the roll number of the student
    public int getRollNo() {
        return rollNo;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        // Creating an object of the Myinfo class to represent a student named Aniket
        Myinfo Aniket = new Myinfo();

        // Setting the branch of Aniket using the setBranch() method
        Aniket.setBranch("Computer Science Engineering");

        // Printing the branch of Aniket using the getBranch() method
        System.out.println("Branch: " + Aniket.getBranch());

        // Setting the roll number of Aniket using the setRollNo() method
        Aniket.setRollNo(17382);

        // Printing the roll number of Aniket using the getRollNo() method
        System.out.println("Roll Number: " + Aniket.getRollNo());
    }
}
