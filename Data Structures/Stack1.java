public class Stack1 {
	private char stackArray[];
	private int maxSize;
	private int top;

	public boolean isFull() { // return True if stack is full, if not false
		if (top == maxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(char ch) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			stackArray[top] = ch;
		}
	}

	public boolean isEmpty() {
		// return True if stack is Empty,if not false
		if (top == -1) {
			return true;
		} else {
			return false;
		}
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
