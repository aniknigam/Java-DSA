package Arraylist;

import java.util.ArrayList;
//to sort the arraylist we import java.util.Collections;
import java.util.Collections;

public class Arraylistt {
    public static void main(String[] args) {

        // Integer type ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();

        // String type ArrayList
        ArrayList<String> list2 = new ArrayList<>();

        // boolean type arraylist
        ArrayList<Boolean> list3 = new ArrayList<>();

        // adding element in list one
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // printing list1
        System.out.println(list1);
        // output
        // [1, 2, 3]

        // to get an element
        int element = list1.get(0); // 0 is the index of the element
        System.out.println(element);// 1

        // adding element in the between of the arraylist
        list1.add(1, 10);// here 1 is the index and 10 is the element
        System.out.println(list1);
        // output
        // [1, 10, 2, 3]

        // to replace the element we use set method
        list1.set(1, 11);// 1 is the index of the element and 11 is element
        System.out.println(list1);
        // output
        // [1, 11, 2, 3]

        // to remove an element we use remove method
        list1.remove(0);// 0 is the index of the element
        System.out.println(list1);
        // output
        // [11, 2, 3]

        // to get the size
        int size = list1.size();
        System.out.println(size);
        // output
        // 3

        // loop on arraylist
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println();
        // output
        // 11
        // 2
        // 3

        // to sort the arraylist we use Collections.sort for this we first have to
        // import the Collections
        Collections.sort(list1);
        System.out.println(list1);
        // output
        // [2, 3, 11]

        list1.add(0);
        System.out.println(list1);
        // output
        // [2, 3, 11, 0]

        // Now list2 which is a String type
        list2.add("Aniket");
        list2.add("Avneesh");
        list2.add("Sundaram");
        System.out.println(list2);
        // output
        // [Aniket, Avneesh, Sundaram]

        // for loop in list 2

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println();

        // output
        // Aniket
        // Avneesh
        // Sundaram

        // Now list3 which is a Boolean List

        list3.add(true);
        list3.add(false);
        list3.add(true);

        // The for loop in this code iterates through the list3 ArrayList, which
        // is a list of boolean values. The b variable is a temporary variable that is
        // used to store each element of the list as it is iterated over. The
        // System.out.println() statement then prints the value of the b variable to the
        // console.
        for (Boolean b : list3) {
            System.out.println(b);
        }

        // output
        // true
        // false
        // true

    }
}
