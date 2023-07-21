package OOPS;

class Student {

    // properties
    String name;
    int age;

    // methods
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class example2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.age = 19;

        s1.printInfo();
    }
}
