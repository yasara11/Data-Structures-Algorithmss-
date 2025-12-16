/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class UnboundedArrayStack {
    private int[]stack;
    private int top;
    private int capacity;
    
    public UnboundedArrayStack(){
        capacity =2;
        stack =new int[capacity];
        top=-1;
    }
    
    public void push(int x){
        if(top ==capacity -1){
            resize(capacity * 2);
        }
        stack [++top] =x;
        System.out.println("Pushed:" + x + " (Capacity:" + capacity + ")");
    }
    
    public int pop(){
        if (top ==-1)return -1;
        int val = stack [top --];
        if (top >0 && top == capacity /4){
            resize(capacity/2);
        }
        return val;
    }
    
    private void resize (int newCapacity){
        int []temp =new int [newCapacity];
        for (int i = 0;i<=top;i++){
            temp[i]=stack[i];
        }
        stack=temp;
        capacity =newCapacity;
    }
    
    public static void main(String[]args){
        UnboundedArrayStack s =new UnboundedArrayStack();
        s.push(10);s.push(20);s.push(30);
            System.out.println("Popped:" + s.pop());
        }
    }

    
    
    

