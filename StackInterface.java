/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author savannah
 */
public interface StackInterface {
    public boolean isEmpty();
    public void push(char item) throws StackException;
    public char pop() throws StackException;
    public void popAll();
    public int peek() throws StackException;
}
