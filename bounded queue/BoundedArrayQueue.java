package boundedQueue;

import java.util.NoSuchElementException;

public class BoundedArrayQueue {

    private int maxSize; // Maximum size of the queue
    private int[] array; // Array to store queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int nItems; // Number of elements in the queue

    // Constructor to initialize the queue with a specified size
    public BoundedArrayQueue(int s) {
        maxSize = s; // Set the maximum size
        array = new int[maxSize]; // Initialize the array
        front = 0; // Set the front index to 0
        rear = -1; // Set the rear index to -1 (no elements initially)
        nItems = 0; // Set the initial item count to 0
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int j) {
        if (isFull()) { // Check if the queue is full
            throw new IllegalStateException("Queue is full."); // Throw an exception if full
        } else {
            rear++; // Move the rear index forward
            array[rear] = j; // Add the element at the rear
            nItems++; // Increment the number of items
        }
    }

    // Dequeue operation to remove and return the front element
    public int dequeue() {
        if (isEmpty()) { // Check if the queue is empty
            throw new NoSuchElementException("Queue is empty."); // Throw an exception if empty
        } else {
            int temp = array[front]; // Get the front element
            front++; // Move the front index forward
            nItems--; // Decrease the item count
            return temp; // Return the dequeued element
        }
    }

    // Peek operation to view the front element without removing it
    public int peek() {
        if (isEmpty()) { // Check if the queue is empty
            throw new NoSuchElementException("Queue is empty."); // Throw an exception if empty
        } else {
            return array[front]; // Return the front element
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (nItems == 0); // Return true if the number of items is 0
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear == maxSize - 1); // Return true if rear has reached the last index
    }

    // Display the contents of the queue
    public void display() {
        System.out.print("Queue elements (front to rear): [");
        for (int i = front; i <= rear; i++) { // Iterate from front to rear
            System.out.print(array[i] + " "); // Print each element
        }
        System.out.println("]"); // Close the display
    }
}
