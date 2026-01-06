/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



public class LinkedListFIFOQueue {

    
    private static class Node {
        int item; 
        Node next;

        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node front; // Points to the first node
    private Node rear;  // Points to the last node
    private int size;

    public LinkedListFIFOQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // ENQUEUE: Adds an element to the end (Rear) of the queue.
     
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            // If empty, both front and rear point to the new node
            front = rear = newNode;
        } else {
            // Step: Change the next pointer of last node (rear) to the new node
            rear.next = newNode;
            // Step: Update rear to be the new node
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + value);
    }

   
     //DEQUEUE: Removes the element from the front (Head) of the queue.
     
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty (Underflow)");
            return -1;
        }
        // Save value from front
        int deletedValue = front.item;
        
        // Step: Move front to point to the next node
        front = front.next;

        // If front becomes null, rear must also be null
        if (front == null) {
            rear = null;
        }
        
        size--;
        System.out.println("Dequeued: " + deletedValue);
        return deletedValue;
    }

  // PEEK: Look at the front element without removing it.
     
    public int peek() {
        if (isEmpty()) return -1;
        return front.item;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    // Method to display the queue state
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue (Front to Rear): ");
        while (temp != null) {
            System.out.print(temp.item + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        System.out.println("_____LinkedList FIFO Queue Operations_____");

        //Enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
        System.out.println("Front Element: " + queue.peek());

        //Dequeue
        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("_____End of Operations_____");
    }
}