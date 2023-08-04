package LinkedList;

import java.util.*;

public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("name");
        list.addFirst("my");
        list.add("is");

        System.out.println(list);
        list.add("Aniket");
        System.out.println(list);

        list.addLast("nigam");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println();

        list.removeFirst();
        System.out.println("After removing first element");
        System.out.println(list);
        list.removeLast();
        System.out.println("After removing last element");
        System.out.println(list);

        System.out.println("removing at particular index");
        list.remove(1);// 1 is index here
        System.out.println("after removing Node at index 1");
        System.out.println(list);

    }
}
