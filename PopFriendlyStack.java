/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;
import java.util.Queue;

public class PopFriendlyStack {
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    
    public void push (int x){
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer>temp =q1;
        q1=q2;
        q2=temp;
        System.out.println("Pushed:" + x);
        
    }
    public int pop(){
        if(q1.isEmpty()) return -1;
        return q1.remove();
        
    }
    public static void main(String[]args){
      PopFriendlyStack s = new PopFriendlyStack();
      s.push(1);
      s.push(2);
        System.out.println("Popped:" + s.pop());
    }
    
}
