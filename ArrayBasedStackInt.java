/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author savannah
 */
public class ArrayBasedStackInt {
    private int[] stack;
    private int top;

    public ArrayBasedStackInt(int size) {
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public void push(int item) throws StackException {
        if (isFull())
            throw new StackException("Full Stack");
        else {
            top++;
            stack[top] = item;
        }
    }

    public int pop() throws StackException {
        if (isEmpty())
            throw new StackException("Empty stack");
        else {
            int temp = stack[top];
            top--;
            return temp;
        }
    }

    public int peek() throws StackException {
        if (isEmpty())
            throw new StackException("Empty stack");
        else
            return stack[top];
    }

    public void popAll() {
        top = -1;
    }
}

