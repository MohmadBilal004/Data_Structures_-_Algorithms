public class Stack1
{
    private char[] stackArray;
    private int maxSize;
    private int top;

    public Stack1(int size) // Constructor to initialize the stack
    {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public bool IsFull() // Return True if stack is full, else false
    {
        return top == maxSize - 1;
    }

    public void Push(char ch)
    {
        if (IsFull())
        {
            Console.WriteLine("Stack is full");
        }
        else
        {
            stackArray[++top] = ch;
        }
    }

    public bool IsEmpty() // Return True if stack is empty, else false
    {
        return top == -1;
    }

    public char Pop()
    {
        if (IsEmpty())
        {
            return '*'; // Return '*' to indicate empty stack
        }
        else
        {
            return stackArray[top--];
        }
    }

    public char Peek()
    {
        if (IsEmpty())
        {
            return '*'; // Return '*' to indicate empty stack
        }
        else
        {
            return stackArray[top];
        }
    }
}
