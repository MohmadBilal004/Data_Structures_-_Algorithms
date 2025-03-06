public class LinearQueue
{
    private double[] queueArray;
    private int maxSize;
    private int front; // Tracks the front value of the queue
    private int rear;  // Tracks the rear value of the queue
    private int nItems; // Tracks the number of items in the queue

    public LinearQueue(int max) // Constructor
    {
        this.maxSize = max;
        queueArray = new double[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public bool IsEmpty() // Check if the queue is empty
    {
        return (nItems == 0);
    }

    public bool IsFull() // Check if the queue is full
    {
        return (rear == maxSize - 1);
    }

    public void Enqueue(double value) // Add an item to the queue
    {
        if (IsFull())
        {
            Console.WriteLine("Sorry, the Queue is Full");
        }
        else
        {
            queueArray[++rear] = value;
            nItems++;
        }
    }

    public double Dequeue() // Remove and return the front item of the queue
    {
        if (IsEmpty())
        {
            return -9999; // Return an error value if the queue is empty
        }
        else
        {
            nItems--;
            return queueArray[front++];
        }
    }

    public double Peek() // Return the front item without removing it
    {
        if (IsEmpty())
        {
            return -9999; // Return an error value if the queue is empty
        }
        else
        {
            return queueArray[front];
        }
    }
}
