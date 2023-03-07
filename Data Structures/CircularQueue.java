public class CircularQueue {
    private Double[] queueArray;
    private int maxSize;
    private int front; // tracks the front value of the queue
    private int rear; // tracks the rear value of the queue
    int nItems; // Tracks the no of items in the queue

    public CircularQueue(int max) { // constructor
        this.maxSize = max;
        queueArray = new Double[max];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public void enqueue(double value) {
        if (isFull()) {
            System.out.println("Sorry the Queue is Full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
        }
    }

    public double dequeue() {
        if (isEmpty()) {
            return -9999;
        } else {
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return queueArray[front++];
        }
    }

    public double peek() {
        if (isEmpty()) {
            return -9999;
        } else {
            return queueArray[front];
        }
    }
}