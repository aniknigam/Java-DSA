package OOPS;

interface Gagets {
    void gagetFun(String fun);
}

interface Electronic {
    void price(int n);
}

class Laptop implements Gagets, Electronic {
    String name;

    @Override
    public void gagetFun(String fun) {
        System.out.println("this function of this " + name + " laptop is " + fun);
    }

    @Override
    public void price(int n) {
        System.out.println("the price of this " + name + " is " + n);
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.name = "HP Pavilion";
        l1.gagetFun("Coding, Gaming, Trading, Browsing etc.");
        l1.price(56000);
    }
}
