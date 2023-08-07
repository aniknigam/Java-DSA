package Queue;

import java.util.*;

public class QueueCollectionFramework {
    public static void main(String[] args) {
        // we have written new LinkedList here because queue is a interface is
        // collection framework and we can only create objects of the classes so that is
        // why we have written LinkedList and also we cannot create objects of
        // interfaces

        // queue interface can be implemented by two classes
        // 1. Linked List
        // 2. ArrayDequeue

        // Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}

/*
 * ArrayDeque is generally the preferred choice for implementing a Queue in most
 * scenarios due to its better performance and lower memory usage. However, if
 * you require the specific features provided by LinkedList, or if you have
 * specific usage patterns where LinkedList outperforms ArrayDeque, then you
 * might choose LinkedList accordingly
 */