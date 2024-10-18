import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical {

    
    public CollectionPractical() {
        // Declare the collection and initialize it as a LinkedList
        Collection<Integer> c = new LinkedList<>();

        // Add elements to the collection
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        // Check if the collection is empty
        System.out.println("Is the collection empty? " + c.isEmpty());

        // Print the size of the collection
        System.out.println("Size of the collection: " + c.size());

        // Check if the collection contains a specific element (30)
        System.out.println("Does the collection contain 30? " + c.contains(30));

        // Remove a specific element (40)
        c.remove(40);

        // Display the remaining elements of the collection
        System.out.println("Remaining elements: " + c);
    }

    
    public static void main(String[] args) {
        
        new CollectionPractical();
    }
}
