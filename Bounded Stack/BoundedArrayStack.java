package boundedStack;

import java.util.NoSuchElementException;

public class BoundedArrayStack {

    private int maxSize;
    private int[] array;
    private int tos;

    public BoundedArrayStack(int s) {
        maxSize = s;
        array = new int[maxSize];
        tos = -1;
    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isFull() {
        return tos == maxSize - 1;
    }

    public void push(int j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }
        array[++tos] = j;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return array[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return array[tos];
    }

    public void print() {
        System.out.print("Stack elements: [");
        for (int i = tos; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
