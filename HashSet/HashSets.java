package HashSet;

//we need to import HashSet in order to use it
import java.util.HashSet;
//iterator is used to traverse all the element in HashSet. HashSet does not contain HashSet se we use Iterator and to use this we need to import this.
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {

        // Java HashSet Features
        // A few important features of HashSet are mentioned below:

        // Implements Set Interface.
        // The underlying data structure for HashSet is Hashtable.
        // As it implements the Set Interface, duplicate values are not allowed.
        // Objects that you insert in HashSet are not guaranteed to be inserted in the
        // same order. Objects are inserted based on their hash code.
        // NULL elements are allowed in HashSet.
        // creation of hashset, it is integer type and set is the name of the hashset
        HashSet<Integer> set = new HashSet<>();

        // inserting the integer in the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        // output - [1, 2, 3, 4]

        // contains - to check if a particular value exist in the HashSet or not we use
        // it

        if (set.contains(3)) {
            System.out.println("yes it contains");
        }
        // output - yes it contains

        // one more example

        if (set.contains(8)) {
            System.out.println("yes it contains");
        } else {
            System.out.println("it do not contain");
        }
        // output - it do not contain

        // remove - to remove element from the HashSet we use remove
        // ! - this chage the value from true to false and false to true
        // exapmple

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("we have deleted 1 from the set");
        }
        // output - we have deleted 1 from the set
        // this is printed because ! is used and we have changed the value from false to
        // true.

        // size - it will return the size of set
        int t = set.size();
        System.out.println(t);
        // output - 3 because we have removed 1 from the set otherwise the output would
        // be 4

        // ----------------------------------------------------------------

        // Iterator - The Java.util.HashSet.iterator() method is used to return an
        // iterator of the same elements as the hash set. The elements are returned in
        // random order from what present in the hash set.

        // Syntax:

        // Iterator iterate_value = Hash_Set.iterator();
        // Parameters: The function does not take any parameter.

        // Return Value: The method iterates over the elements of the hash set and
        // returns the values(iterators).

        // Below program illustrate the Java.util.HashSet.iterator() method:

        Iterator it = set.iterator();
        // it has two important function
        // 1 - hasNext; - it return the value either True or False, if the set cotains
        // the next value it will return true otherwise it will return false.
        // 2- next; - it return the next element from the HashSet

        // example

        // till I have hasNext I will print next.
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // output
        // 2
        // 3
        // 4
    }
}