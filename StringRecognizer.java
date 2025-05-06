/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

import java.util.Scanner;

/**
 *
 * @author savannah
 */
public class StringRecognizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a String in the form w$w");
        String s1 = scanner.nextLine();
        
        if(form(s1)){
            System.out.println("String is in correct format");
        }
        else{
            System.out.println("String is not in w$w form");
        }
    
    }
    public static boolean form(String s1){
        int dollarIndex = s1.indexOf('$');
        if (dollarIndex < 0){
            return false;
        }
        
        String w = s1.substring(0, dollarIndex);
        String w2 = s1.substring(dollarIndex + 1);
        LinkedBasedStack stack = new LinkedBasedStack();
        
        if (w.length() != w2.length()){
        return false;
        }
        for(int i = 0; i < w2.length(); i++){
            stack.push(w2.charAt(i));
        }
            
            for(int i = 0; i < w.length(); i++){
                if(w.charAt(i) != stack.pop())
                    return false;
            }
        
        return true;
        }
    }


