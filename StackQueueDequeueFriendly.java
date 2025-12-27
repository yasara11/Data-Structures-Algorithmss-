/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;

public class StackQueueDequeueFriendly {
    private Stack<Integer> stackNewstOnTop;
    private Stack<Integer> stackOldestOnTop;
    
    public StackQueueDequeueFriendly (){
        stackNewstOnTop = new Stack<>();
        stackOldestOnTop = new Stack<>();
    }
    
    //Enqueue:O(n)
    //We must move elements to ensure the oldest is always on top of stackOldestOnTop
    
    public void enqueue(int value){
        
        //Move everything from oldest to newest
        
        while(!stackOldestOnTop.isEmpty()){
           stackNewstOnTop.push(stackOldestOnTop.pop()) ;
        }
        
        //push new value
        
        stackNewstOnTop.push(value);
        
        //Move everything back to oldest
        
        while(!stackNewstOnTop.isEmpty()){
            stackOldestOnTop.push(stackNewstOnTop.pop());
        }
        
    }
    
    //Dequeue:O(1)
    
    public int dequeue(){
        if(stackOldestOnTop.isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        int removedValue = stackOldestOnTop.pop();
        System.out.println("Dequeued:" + removedValue);
        return removedValue;
    }
    
//Peek:O(1)
    
public int peek(){
    if (stackOldestOnTop.isEmpty()){
        throw new RuntimeException("Queue is Empty");
    }
    return stackOldestOnTop.peek();
}

public boolean isEmpty(){
    return stackOldestOnTop.isEmpty();
}



public static void main(String[]args){
    StackQueueDequeueFriendly queue =new StackQueueDequeueFriendly();
    
    System.out.println("_______Queue Operations Start_______");
    
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    
    System.out.println("Front Element (peek):" + queue.peek()) ;
    
    queue.dequeue();
    queue.dequeue();
   
    
    System.out.println("Is Queue Empty?" + queue.isEmpty());
    
    queue.dequeue();
    System.out.println("Is Queue Empty now?" +queue.isEmpty() );
    
    System.out.println("_______Queue Operations End_______");
    
}
}
    
    