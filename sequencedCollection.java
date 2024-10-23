import java.util.LinkedList;  // Importing LinkedList class from the java.util package
import java.util.SequencedCollection;  // Importing SequencedCollection interface (available in Java 21+)

 class Ex {

    // Constructor of the Ex class
    public Ex() {
        // Declare a SequencedCollection of Integer type and initialize it with a LinkedList
        // LinkedList implements SequencedCollection (starting from Java 21)
        SequencedCollection<Integer> sc = new LinkedList<>();  // Specify the type as Integer for the list

        // Adding elements to the beginning and end of the list
        sc.addFirst(5);  // Adds 5 to the front of the list
        sc.addFirst(8);  // Adds 8 to the front of the list, pushing 5 back
        sc.addLast(3);   // Adds 3 to the end of the list

        // Output the first element of the list
        System.out.println(sc.getFirst());  // Retrieves and prints the first element (should print 8)

        // Remove and print the last element of the list
        System.out.println(sc.removeLast());  // Removes and prints the last element (should print 3)

        // Output the current state of the list
        System.out.println(sc);  // Prints the list as is (should print [8, 5])

        // Output the reversed version of the list (this method may not exist in older versions)
        System.out.println(sc.reversed());  // Prints the reversed list (should print [5, 8])
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        new Ex();  // Create an instance of the Ex class, which will invoke the constructor and execute its code
    }
}
