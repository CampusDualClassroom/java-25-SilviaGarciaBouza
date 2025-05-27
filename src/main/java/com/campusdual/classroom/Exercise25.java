package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> myStack = new Stack<>();
        myStack.push("Smith");
        myStack.push("Montessori");
        myStack.push("Peralta");
        myStack.push("House");
        return myStack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> myStack= createStack();
        System.out.println(myStack);
        printAndEmptyStack(myStack);
        System.out.println(myStack);

    }



}
