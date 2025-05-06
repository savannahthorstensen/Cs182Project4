/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author savannah
 */
public class LinkedBasedStack implements StackInterface {
    private CharNode top;
    public LinkedBasedStack(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
   
    public void push(char item){
        CharNode n = new CharNode(item);
        n.next = top;
        top = n;
    }
    public char pop() throws StackException{
        if(isEmpty())
            throw new StackException("Error: stack is empty");
            else{
                    char temp = top.data;
                    top = top.next;
                    return temp;
                    }
        
    }
    public void popAll(){
        top = null;
    }
  
    public int peek() throws StackException{
        if(isEmpty())
            throw new StackException("Stack is empty");
            else{
                    return top.data;
                    }
        }
    }

 class CharNode{
    char data;
    CharNode next;
    public CharNode(){
        data = 0;
        next = null;
    }
    public CharNode(char data){
        this.data = data;
        this.next = null;
    }
    @Override
    public String toString(){
        return data + " ";
    }
}