# Cs182Project4

Here is a language recognition algorithm for the language L= { w$w’: w is a possibly empty string of characters other than $, w’= reverse(w) }

In a main class named StringRecognizer, prompt the user for a String, then use the LinkBasedStack stack to determine and display a message indicating whether that String is in the language or not.


In postfix (also called Reverse Polish Notation or RPN), operators come after their operands, making expressions easy to evaluate using a stack.
For example:

3 4 + → means 3 + 4

5 1 2 + 4 * + 3 - → means 5 + ((1 + 2) * 4) - 3 → evaluates to 14

Postfix expressions don't need parentheses!

Objective:
Write a program that reads a postfix expression and uses a stack to evaluate it.

Requirements:
Implement your own Stack class (do NOT use built-in stacks).

The program should:

Read a postfix expression (numbers and operators separated by spaces).

Traverse the tokens left to right:

If the token is a number, push it onto the stack.

If the token is an operator (+, -, *, /):

Pop two numbers from the stack.

Apply the operator (second popped OP first popped — be careful with order!).

Push the result back onto the stack.

After reading all tokens, the final result should be the single value remaining on the stack.

If an error occurs (like too few operands), handle it gracefully.

