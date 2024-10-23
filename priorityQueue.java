import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        // Create a PriorityQueue to store integers
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pQueue.add(20);
        pQueue.add(10);
        pQueue.add(15);

        // Print the PriorityQueue (order may not show how elements will be removed)
        System.out.println(pQueue);

        // Get the size of the PriorityQueue before removing elements
        int size = pQueue.size();

        // Remove and print each element in order (smallest to largest)
        for (int i = 0; i < size; i++) {
            System.out.println(pQueue.poll());  // Remove and print the smallest element
        }

        // Print the original size of the PriorityQueue (before polling)
        System.out.println("Size  :" + size);
    }
}
