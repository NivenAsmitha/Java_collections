package queuestacktest;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full");
        }
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
