/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;
import java.util.Queue;

public class PushFriendlyStack {
Queue<Integer>q1=new LinkedList<>();
Queue<Integer>q2=new LinkedList<>();

public void push(int x){
    q1.add(x);
    System.out.println("Pushed:" + x);
}

public int pop(){
    if(q1.isEmpty())return -1;
    while(q1.size()>1){
        q2.add(q1.remove());
    }
    int poppedValue = q1.remove();
    Queue<Integer>temp=q1;
    q1=q2;
    q2=temp;
    return poppedValue;
}
public static void main(String[]args){
    PushFriendlyStack s= new PushFriendlyStack();
    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println("Popped:" + s.pop());
}
}