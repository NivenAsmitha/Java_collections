package queuestacktest;

import java.util.NoSuchElementException;

public class StackQueue {
    private Stack stack1;
    private Stack stack2;

    public StackQueue(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
