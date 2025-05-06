/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author savannah
 */
public class ArrayBasedStack {
    private char[] stack;
    private int top;
    
    public ArrayBasedStack(int size){
        stack = new char[size];
        top = -1;
        }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == stack.length -1);
    }
    public void push(char item) throws StackException{
        if(isFull())
            throw new StackException("Full Stack");
        else{
            top++;
            stack[top] = item;
        }
    }
    public char pop() throws StackException{
        if(isEmpty())
            throw new StackException("Empty stack");
        else{
            char temp = stack[top];
            top--;
            return temp;
        }
    }
    public char peek() throws StackException{
        if(isEmpty())
            throw new StackException("Empty stack");
        else
            return stack[top];
        }
    public void popAll() {
        top = -1;
    }
}

