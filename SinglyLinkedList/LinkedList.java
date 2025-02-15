package SinglyLinkedListTest;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(int data, int afterValue) {
        Node current = head;
        while (current != null && current.data != afterValue) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value " + afterValue + " not found.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public Node findLast() {
        if (head == null) return null;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    @Override
    public String toString() {
        if (head == null) return "List is empty.";
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}
