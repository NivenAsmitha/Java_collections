package queueStack;

public class Main {
    public static void main(String[] args) {

        FIFOQueue<Integer> queue = new FIFOQueue<>();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display the queue
        System.out.println("Initial Queue: " + queue);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        // Add another element
        queue.enqueue(40);
        System.out.println("Queue after "
        		+ "enqueue 40: " + queue);
        
        QueueStack<Integer> stack = new QueueStack<>();
        
        stack.push(queue.dequeue());
        stack.push(queue.dequeue());
        stack.push(queue.dequeue());
        
        System.out.println("Initial Stack: " + stack);
        
      // Peek at the top element
      System.out.println("Top element: " + stack.peek());
//
    }
}

