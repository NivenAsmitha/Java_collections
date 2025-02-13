package boundedQueue;

public class QueueApp {

    public static void main(String[] args) {
        // Create a queue with a maximum size of 5
        BoundedArrayQueue theQueue = new BoundedArrayQueue(5);

        // Enqueue elements into the queue
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);
        theQueue.enqueue(50);

        // Display the queue elements
        theQueue.display();

        // Peek at the front element without removing it
        System.out.println("Front element is: " + theQueue.peek());

        // Dequeue an element and display it
        System.out.println("Dequeued: " + theQueue.dequeue());

        // Display the queue after the dequeue operation
        theQueue.display();
    }
}
