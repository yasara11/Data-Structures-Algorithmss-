/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;

public class EnqueueFriendlyQueue {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    
    public void enqueue(int x){
        s1.push(x);
        System.out.println("Enqueued:" + x);
    }
    public int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        
        return s2.isEmpty()? -1 :s2.pop();
    }
    
    public static void main(String[]args){
        EnqueueFriendlyQueue q =new  EnqueueFriendlyQueue();
        q.enqueue(100);
        q.enqueue(200);
        System.out.println("Dequeued:" + q.dequeue());
    }
}
