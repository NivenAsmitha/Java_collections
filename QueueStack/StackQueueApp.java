package queuestacktest;

import queuestacktest.StackQueue; // Importing StackQueue class
import queuestacktest.Stack;      // Importing Stack class

public class StackQueueApp {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue(10);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements
        System.out.println(queue.dequeue()); // Outputs 1
        System.out.println(queue.peek());    // Outputs 2

        // Enqueue more elements
        queue.enqueue(4);
        queue.enqueue(5);

        // Dequeue elements
        System.out.println(queue.dequeue()); // Outputs 2
        System.out.println(queue.dequeue()); // Outputs 3
    }
}
