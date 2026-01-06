/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class LinkedListStack {

   private static class Node{
       int item;
       Node next;
       
       Node (int item){
           this.item =item;
           this.next = null;
       }
   }
   
   private Node head;
   private int size;
   
   public LinkedListStack (){
       this.head =null;
       this.size = 0;
   }
   
   public void push(int value){
       Node newNode = new Node(value);
       newNode.next=head;
       head=newNode;
       size++;
       System.out.println("Pushed:" + value);
   }
   
   public int pop(){
       if(isEmpty()){
           System.out.println("Stack is empty (underflow)");
           return -1;
       }
       
       int deletedValue =head.item;
       head = head.next;
       size--;
       System.out.println("Popped:" + deletedValue);
       return deletedValue;
   }
   
   public int peek(){
       if (isEmpty()) return -1;
       return head.item;
   }
   
   public boolean isEmpty(){
       return head == null;
   }
   
   public int size(){
       return size;
   }
   
   
   
   
    public static void main(String[] args) {
       LinkedListStack stack = new LinkedListStack ();
       
        System.out.println("_____LinkedList Stack Operations_____");
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Current Top:" + stack.peek());
        System.out.println("Stack Size:" + stack.size());
        
        stack.pop();
        stack.pop();
        
        System.out.println("Current Top after Pops:"+ stack.peek());
        
        stack.pop();
        stack.pop();
        
        System.out.println("_____End of Operations_____");
    }
    
}
