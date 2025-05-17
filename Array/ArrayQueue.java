package Array;
public class ArrayQueue {
    private int SIZE = 100;
    private int[] queue = new int[SIZE];
    private int front = -1;
    private int rear = -1;
 
    // Enqueue operation
    public void enqueue(int value) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is Full (Overflow)");
        } else {
            if (front == -1) front = 0;  // First insertion
            rear++;
            queue[rear] = value;
            System.out.println("Inserted: " + value);
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty (Underflow)");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    // Display operation
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}

