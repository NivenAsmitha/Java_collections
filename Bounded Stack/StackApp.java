package boundedStack;

public class StackApp {

    public static void main(String[] args) {
        BoundedArrayStack theStack = new BoundedArrayStack(5);

        for (int i = 1; i <= 6; i++) {
            if (!theStack.isFull()) {
                theStack.push(i * 10);
            } else {
                System.out.println("Cannot push. Stack is full");
            }
        }

        theStack.print();

        if (!theStack.isEmpty()) {
            System.out.println("Top element is: " + theStack.peek());
        } else {
            System.out.println("Stack is empty, nothing to peek");
        }

        if (!theStack.isEmpty()) {
            while (!theStack.isEmpty()) {
                int val = theStack.pop();
                System.out.print(val + " ");
            }
        } else {
            System.out.println("Cannot pop. Stack is empty");
        }
    }
}
