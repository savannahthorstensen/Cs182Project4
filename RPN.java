/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project4;

/**
 *
 * @author savannah
 */
import java.util.Scanner;

public class RPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a postfix expression (e.g., 5 1 2 + 4 * + 3 -):");
        String input = scanner.nextLine();

        try {
            int result = evaluatePostfix(input);
            System.out.println("Result: " + result);
        } catch (StackException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input or syntax error.");
        }
    }

    public static int evaluatePostfix(String postfix) {
        String[] parts = postfix.split(" ");
        ArrayBasedStackInt stack = new ArrayBasedStackInt(100);

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (isNumber(part)) {
                stack.push(Integer.parseInt(part));
            } else if (isOperator(part)) {
                int b = stack.pop(); 
                int a = stack.pop(); 
                int result = 0;

                if (part.equals("+")) {
                    result = a + b;
                } else if (part.equals("-")) {
                    result = a - b;
                } else if (part.equals("*")) {
                    result = a * b;
                } else if (part.equals("/")) {
                    result = a / b;
                }

                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid part: " + part);
            }
        }

        return stack.pop();
    }

    private static boolean isNumber(String part) {
        try {
            Integer.parseInt(part);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String part) {
        return part.equals("+") || part.equals("-") || part.equals("*") || part.equals("/");
    }
}
