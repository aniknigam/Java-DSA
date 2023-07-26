package OOPS;

class Bike10 {
    // In Java, the final keyword is used to indicate that a variable, method, or
    // class cannot be modified or extended.
    final int speedlimit;// blank final variable

    Bike10() {
        speedlimit = 200;
        System.out.println(speedlimit);
    }
}

public class abstractionEx2 {
    public static void main(String args[]) {
        new Bike10();
    }
}
