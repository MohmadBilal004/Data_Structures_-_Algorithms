public class Stack2 {
    private char stackArray[];
    private int maxSize;
    private int top;

    public boolean isFull() {
        // return True if stack is full, if not false
        return (top == maxSize - 1);

    }

    public void push(char ch) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = ch; // this is a prefix to use *++ bcz we have to increase top first and then insert
                                    // the value
        }

    }

    public boolean isEmpty() {
        // return True if stack is Empty
        return (top == -1);
    }

    public char pop() {
        if (isEmpty()) {
            return '*';
        } else {
            return stackArray[top--];
        }

    }

    public char peek() {
        if (isEmpty()) {
            return '*';
        } else {
            return stackArray[top];
        }

    }

}
