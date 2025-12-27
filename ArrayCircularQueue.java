/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ArrayCircularQueue {
    private int[]queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    //Constructor to initialize the queue
    public ArrayCircularQueue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front=0;
        this.rear=-1; // Points to the last inserted element
        this.size=0;
    }
    
    //check if the queue is full
    public boolean isFull(){
        return size ==capacity;
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        return size ==0;
    }
    
    //Add element to the rear
    public void enqueue(int value){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        //Circular increment:if rear is at end,wrap to 0
        rear =(rear + 1)% capacity;
        queue[rear]=value;
        size++;
        System.out.println("Enqueued:" + value);
    }
    //Remove element from the front
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int value=queue[front];
        front=(front+1)%capacity;
        size--;
        System.out.println("Dequeued:" +value);
        return value;
    }
    
    //view the front element without removing it
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }
    
    public static void main(String[]args){
        ArrayCircularQueue cq =new  ArrayCircularQueue(5);
        
        System.out.println("_____Circular Queue Operations Start_____");
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        
        System.out.println("Front element is:" + cq.peek());
        
        cq.dequeue();//10 removed
        cq.dequeue();//20 removed
        
        //Adding more elmenets to test circular behavior
        cq.enqueue(60);
        cq.enqueue(70);
        
        System.out.println("Current Front element:" +cq.peek());
        System.out.println("Is queue full?" + cq.isFull());
        
        System.out.println("_____Circular Queue Operations End_____");
    }
            
           
            
            

    
    
}
