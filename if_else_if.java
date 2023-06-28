import java.util.*;

public class if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        // checking if the age is above 18 or not

        // if (age > 18) {
        // System.out.println("You are an adult");
        // } else {
        // System.out.println("you are not an adult");
        // }
        // sc.close();

        // checking if the number is even or odd

        // if (number % 2 == 0) {
        // System.out.println("Number is even");
        // } else {
        // System.out.println("Number is odd");
        // }

        // comparing a and b

        // if (a == b ) {
        // System.out.println("a is equal to b");
        // } else {
        // if(a > b){
        // System.out.println("a is greater");
        // } else {
        // System.out.println("b is greater");
        // }
        // }

        // with the help of else if

        // if (a == b) {
        // System.out.println("a is equal to b");
        // } else if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("b is greater");
        // }
        // sc.close();

        // using if else to greet someone

        // if(button == 1){
        // System.out.println("hello");
        // } else if( button == 2){
        // System.out.println("namaste!");
        // } else if(button == 3){
        // System.out.println("Bonjor");
        // }else{
        // System.out.println("invalid button");
        // }

        // doing same task with the help of switch case

        // switch(button){
        // case 1: System.out.println("hello");
        // break;

        // case 2: System.out.println("namaste");
        // break;

        // case 3: System.out.println("bonjor");
        // break;

        // default: System.out.println("invalid button");
        // }

        // sc.close();

        // Finding the month of the year with the switch case

        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("invalid month");
        }
        sc.close();

        // finding the grade of student with the switch case
        int score = 85;
        String grade;
        // the grades are given in range for ex 80 to 90
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("The grade is: " + grade);
    }
}
