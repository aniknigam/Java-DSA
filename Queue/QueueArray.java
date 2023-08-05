package Queue;

public class QueueArray {

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        // we don't need to declare front beucause it is already front = 0

        Queue(int size) {
            arr = new int[size];
            this.size = size;

        }

        // check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add element in a queue
        // O(n) - time complexity
        public static void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue if full");
                return;
            }
            // increase rear
            rear++;
            arr[rear] = data;
        }

        // remove element from queue
        // O(n) time complexity
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
