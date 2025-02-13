package ArrayCircularQueue;  // Define the package name

import java.util.NoSuchElementException;  // Import NoSuchElementException for handling empty queue exceptions

// Circular Queue implementation in Java
public class ArrayCircularQueue {
    int SIZE = 5;  // Size of the circular queue
    int front, rear;  // Variables to track the front and rear positions in the queue
    int items[] = new int[SIZE];  // Array to store queue elements

    // Constructor to initialize front and rear
    public ArrayCircularQueue() {
        front = -1;  // Set front to -1, indicating the queue is empty
        rear = -1;   // Set rear to -1, indicating the queue is empty
    }

    // Check if the queue is full
    boolean isFull() {
        // The queue is full if the rear is just behind the front in a circular manner
        return (front == 0 && rear == SIZE - 1) || (front == rear + 1);
    }

    // Check if the queue is empty
    boolean isEmpty() {
        // The queue is empty when front is -1
        return front == -1;
    }

    // Add an element to the queue
    void enQueue(int element) {
        if (isFull()) {  // Check if the queue is full
            System.out.println("Queue is full");  // Print a message if full
        } else {
            if (front == -1) front = 0;  // If inserting the first element, set front to 0
            rear = (rear + 1) % SIZE;  // Update rear in a circular manner
            items[rear] = element;  // Add the element to the queue
            System.out.println("Inserted: " + element);  // Print the inserted element
        }
    }

    // Remove an element from the queue
    int deQueue() {
        if (isEmpty()) {  // Check if the queue is empty
            throw new NoSuchElementException("Queue is empty!");  // Throw an exception if empty
        } else {
            int element = items[front];  // Retrieve the front element
            if (front == rear) {  // If only one element in the queue
                front = -1;  // Reset front
                rear = -1;   // Reset rear
            } else {
                front = (front + 1) % SIZE;  // Move front forward in a circular manner
            }
            return element;  // Return the removed element
        }
    }

    // Display all elements in the queue
    void display() {
        if (isEmpty()) {  // Check if the queue is empty
            System.out.println("Queue is empty");  // Print a message if empty
        } else {
            System.out.print("Items: [");
            int i = front;
            while (true) {  // Iterate through the queue from front to rear
                System.out.print(items[i]);  // Print each element
                if (i == rear) break;  // Stop when rear is reached
                System.out.print(", ");  // Print a comma between elements
                i = (i + 1) % SIZE;  // Move to the next element in a circular manner
            }
            System.out.println("]");  // Close the bracket after displaying all elements
        }
    }

    // Main method to test the circular queue
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();  // Create a new instance of the circular queue

        try {
            // Attempt to dequeue from an empty queue
            q.deQueue();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());  // Print the exception message
        }

        // Add elements to the queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Attempt to enqueue when the queue is full
        q.enQueue(6);

        // Display the current state of the queue
        q.display();

        // Remove an element from the queue
        int element = q.deQueue();
        System.out.println("Deleted Element is " + element);  // Print the removed element

        // Display the current state of the queue after deletion
        q.display();

        // Add another element to the queue
        q.enQueue(7);
        q.display();  // Display the updated state of the queue

        // Attempt to enqueue when the queue is full again
        q.enQueue(8);
    }
}
