/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SinglyLinkedList {

   
    
    private static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    private Node head;
    
    public SinglyLinkedList(){
        this.head=null;
    }
    
    //Search Operation
    public boolean search(int item){
        Node current=head; // Make head as current node
        while(current!=null){ //Loop until current node is null
            if(current.data ==item){
                return true; //Match found
            }
            current =current.next;
        }
        return false; //Not found
    }
    
    //Insert at the Beginning 
    public void insertAtBeginning(int data){
        Node newNode =new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted" + data + "at the beginning.");
    }
    
    //Insert at the End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
            if(head ==null){
            head = newNode;
                return;
        }
            
            Node current =head;
            while(current.next != null){ // step 1: Go to the last Node
                current =current.next;  
        }
            current.next = newNode; //Step 2:Change next of last node to new node
            newNode.next = null;  //step 3:New node points to null
            System.out.println("Inserted" + data + " at the end.");
    }
    
    //Insert at a Specific Position
    public void insertAfter(int afterItem,int data){
        Node current =head;
        while(current !=null && current.data != afterItem){
            current =current.next;
        }
        
        if (current != null){ //If given node exists
            Node newNode =new Node(data);  //step 1: create new node
            newNode = current.next;   // Step 3: New node points to original next
            current.next = newNode;  //step 2:Given node points to new node
            System.out.println("Inserted" + data + " after" + afterItem);
        }else{
            System.out.println("Node with value" + afterItem + "not found.");
        }
    }
    
    //Delete Operations
    
    //Delete from the Beginning
    public void deleteFromBeginning(){
        if(head ==null){
            System.out.println("Lit is empty.");
            return;
        }
        int deletedValue = head.data;
        head = head.next;
        System.out.println("Deleted from beginning:" + deletedValue);
    }
    
    //Delete from the End
    public void deleteFromENd(){
        if(head ==null)return;
        if(head.next ==null){
            head = null;
            return;
        }
        
        Node current =head;
        Node previous = null;
        while(current.next != null){  //Traverse until last node
            previous = current;
            current = current.next;
        }
        previous.next = null;
        System.out.println("Deleted from end.");
    }
    
    //Delete a Specific Node
    public void deleteSpecificNode(int value){
        if(head == null)return;
        
        if(head.data ==value){
            head=head.next;
            return;
        }
        
        Node current = head;
        Node previous = null;
        while(current != null && current.data != value){
            previous = current;
            current = current.next;
        }
        
        if(current != null){
            previous.next = current.next;
            System.out.println("Deleted specific node:" + value);
        }
    }
    
    //Method to display the list 
    public void display(){
        Node current = head;
        System.out.println("Linked List:");
        while(current != null){
            System.out.println(current.data+" ->");
            current = current.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[]args){
        SinglyLinkedList List = new SinglyLinkedList();
        
        System.out.println("______ Singly Linked List Operations");
        
        //Testing Insertions
        List.insertAtBeginning(9);
        List.insertAtEnd(11);
        List.insertAtEnd(13);
        List.insertAtBeginning(7);
        List.display();
        
        //Testing Specific Insertion
        List.insertAfter(11,12);
        List.display();
        
        //Testing Search
        System.out.println("Is 11 in the List?" + List.search(11));
        System.out.println("Is 100 in the List?" + List.search(100));
        
        //Testing Deletions
        List.deleteFromBeginning();
        List.display();
        
        List.deleteFromENd();
        List.display();
        
        List.deleteSpecificNode(11);
        List.display();
        
        System.out.println("______Final List Output ______");
        List.display();
    }
}
    

 
