package Queue;

public class circularQueueArray {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            // if we have only one element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("deleted element: " + q.dequeue());
        q.enqueue(4);
        System.out.println("deleted element: " + q.dequeue());
        q.enqueue(5);
        System.out.println(q.isFull());

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
        System.out.println(q.isFull());

    }
}
