/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class DoublyLinkedList {
    private static class Node{
        int data;
        Node prev;
        Node next;
        
        Node (int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    private Node head;
    private Node tail;
    
    public DoublyLinkedList(){
        this.head =null;
        this.tail = null;
    }
    
    //Insert Operations
    //Insert at the Beginning
    
    public void prepend(int data){
        Node newNode =new Node(data);
        if (head == null){
            head =tail = newNode;
        }else{
            newNode.next =head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Prepended:" + data);
    }
    
    //Insert at the End
    public void append(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head =tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Appended:" +data);
    }
    
    //Delete Operations
    //Delete a specific node by value
    
    public void delete(int value){
        if(head == null) return;
        
        Node current = head;
        while(current != null){
            if(current.data == value){
                //Case 1: Delete head
                if (current ==head){
                    head = head.next;
                    if(head !=null)head.prev =null;
                    else tail = null;
                }
                //Case 2: Delete Tail
                else if (current == tail){
                    tail =tail.prev;
                    tail.next = null;
                }
                //Case 3:Delete from Middle
                else{
                    current.prev.next = current.next;
                    current.next.prev=current.prev;
                }
                System.out.println("Deleted:" + value);
                return;
            }
            current = current.next;
        }
    }
    
    //Traversal
    
    //Display Forward
    public void displayForward(){
        Node current =head;
        System.out.println("Forward: ");
        while(current != null){
            System.out.println(current.data +"<->");
            current = current.next;
        }
        System.out.println("null");
    }
    
    //Display Backward
    public void displayBackward(){
        Node current =tail;
        System.out.println("Backward: ");
        while(current != null){
            System.out.println(current.data + "<->");
            current = current.prev;
        }
        System.out.println("null");
    }
    
    
    public static void main(String[]args){
        DoublyLinkedList dll = new DoublyLinkedList();
        
        System.out.println("_____Doubly Linked List_____");
        
        dll.append(10);
        dll.append(20);
        dll.prepend(5);
        dll.append(30);
        
        dll.displayForward();
        dll.displayBackward();
        
        dll.delete(20);
        dll.displayForward();
        
        dll.delete(5);
        dll.displayForward();
        
        System.out.println("_____End of Operations_____");
       
        
    }
}
