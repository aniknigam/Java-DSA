import java.util.Scanner;

public class firstp {
    public static void main(String[] args) {
        // System.out.println(""); this is used for printing the statement
        System.out.println("My name is Aniket Nigam\n" + "and this is my first java program");
        System.out.println(
                "I am a btech 3 year student in computer science and engineering and i am from lucknow studying in khwaja moinuddin chishti urdu arabic persian university lucknow");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("With the help of \n");
        System.out.println("*\n**\n***\n****\n*****\n");

        // variables

        String name = "Aniket Nigam";
        String college = "Khwaja Moinuddin Chishti Urdu, Arabic and Persian University";

        System.out.println("My name is " + name + " and my college is " + college);

        int age = 20;
        double cgpa = 8.24;
        String semester = "3rd";

        System.out.println("MY name is " + name + " and my age is " + age + " and my cgpa is " + cgpa
                + " and my semester is " + semester);

        // adding two numbers

        int a = 10;
        int b = 20;
        double c = 38.03;
        double d = 20.03;

        double sum = a + b + c + d;
        System.out.println(sum);

        double solve = (a * c) / (b * d);
        System.out.println(solve);
        System.out.println("\n");

        // taking input from the user

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name1 = sc.nextLine();
        // System.out.println(name1);

        // sc.close();

        // Scanner fun = new Scanner(System.in);
        // System.out.println("Finding area of the rectangle");
        // System.out.println("Enter the value of width and height");
        // int width = fun.nextInt();

        // Scanner nofun = new Scanner(System.in);
        // int height = nofun.nextInt();
        // int area = width * height;
        // System.out.println(area);

        // fun.close();
        // nofun.close();

        // Scanner sc = new Scanner(System.in);
        // int alpha = sc.nextInt();
        // int beta = sc.nextInt();
        // int gama = alpha + beta;
        // System.out.println(gama);

        // sc.close();

        // finding the radius of the circle my takin the input from the user

        // Scanner rad = new Scanner(System.in);
        // System.out.println("Enter the radius:");
        // double radius = rad.nextDouble();
        // double circlearea = 3.14 * (radius * radius);
        // System.out.println("Area of the circle is " + circlearea);
        // rad.close();
        System.out.print("Please enter the numbers to get the table:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number + " X 1 = " + number);
        System.out.println(number + " X 2 = " + (number * 2));
        System.out.println(number + " X 3 = " + (number * 3));
        System.out.println(number + " X 4 = " + (number * 4));
        System.out.println(number + " X 5 = " + (number * 5));
        System.out.println(number + " X 6 = " + (number * 6));
        System.out.println(number + " X 7 = " + (number * 7));
        System.out.println(number + " X 8 = " + (number * 8));
        System.out.println(number + " X 9 = " + (number * 9));
        System.out.println(number + " X 10 = " + (number * 10));

        sc.close();

         
        byte myByte = 10;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L;
        float myFloat = 3.14f;
        double myDouble = 3.14159;
        boolean myBoolean = true;
        char myChar = 'A';

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);
    }
}