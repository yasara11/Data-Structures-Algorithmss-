/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class CircularDoublyLinkedList {

   private static class Node{
       int data;
       Node next;
       Node prev;
       
       Node(int data){
           this.data =data;
           this.next = null;
           this.prev = null;
       }
   }
   
   private Node head = null;
   private Node tail = null;
   
   //Insertion
   //Adding a node to the list
   
   public void add(int data){
       Node newNode =new Node(data);
       
       if (head == null){
           head = newNode;
           tail = newNode;
           head.next = head;
           head.prev = head;
       }else{
           //Link new node with tail and head
           tail.next = newNode;
           newNode.prev = tail;
           newNode.next = head;
           head.prev = newNode;
           tail = newNode;
       }
       System.out.println("Inserted:" + data);
   }
   
   //Deletion
   
   public void delete(int data){
       if(head == null)return;
       
       Node current =head;
       do{
           if(current.data == data){
               if(current == head && current == tail){
                   //Only one node exists
                   head = null;
                   tail =null;
               }else if(current == head){
                   //Removing the head
                   head =head.next;
                   tail.next = head;
                   head.prev = tail;
               }else if(current == tail){
                   //Removing the tail
                   tail =tail.prev;
                   tail.next =head;
                   head.prev =tail;
               }else{
                   //Removing from middle
                   current.prev.next = current.next;
                   current.next.prev = current.prev;
               }
               System.out.println("Deleted:" + data);
               return;
           }
           current= current.next;
       }while (current != head);
       
       System.out.println("Value " + data + "not found.");
   }
   
   //Travesal
   
   public void display(){
       if (head == null){
           System.out.println("List is empty.");
           return;
       }
       Node temp = head;
       System.out.println("Circular Doubly List:");
       do{
           System.out.print(temp.data + "<->");
           temp = temp.next;
       }while (temp != head);
       System.out.println("(Back to Head:" + head.data + ")");
   }
   
   
   
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList ();
        
        System.out.println("______Testing Circular Doubly Linked List______");
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.display();
        
        list.delete(2);
        list.display();
        
        list.delete(1);
        list.display();
        
        System.out.println("______End of Testing______");
    }
    
    
}
