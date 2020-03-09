package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

public class StackMethods {


    public void stackIterator(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Integer integer : stack) {
                System.out.println(integer);
            }
        }
    }

    public void stackFill(Stack<Integer> stack, int elems) {
        Random random = new Random();
        for (int i = 0; i < elems; i++) {
            stack.push(random.nextInt(1000));
        }
    }

    public void flipStacks(Stack<Integer> first,Stack<Integer> second){
        System.out.println("Before flipping , first stack :");
        stackIterator(first);
        System.out.println("Second :");
        stackIterator(second);
        ArrayList<Integer> temp = new ArrayList<>(first);
        first.clear();
        for (Integer nr: second) {
            first.push(nr);
        }
        second.clear();
        for (Integer nr: temp) {
            second.push(nr);
        }
        System.out.println("Done , Flipped. Now , first :");
        stackIterator(first);
        System.out.println("Second :");
        stackIterator(second);
    }
}
