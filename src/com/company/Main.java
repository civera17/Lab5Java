package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try {
            StackMethods stackMethods = new StackMethods();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack1 = new Stack<>();
            stackMethods.stackFill(stack,5);
            stackMethods.stackFill(stack1,5);
            stackMethods.stackIterator(stackMethods.flipStack(stack));
//            stackMethods.flipStacks(stack,stack1);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }
}
