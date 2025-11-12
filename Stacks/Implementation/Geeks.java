package Stacks.Implementation;

//Using Stack class from java.util package\

import java.util.*;

public class Geeks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

// We have 2 constructors in Stacks
// Stack<Integer> stack = new Stack<>(); Used to create an Empty Stack
// Stack<Integer> stack = new Stack<>(20); Used to create a stack with specified
// initial capacity

// Prioritize using ArrayDeque over Stack class in Java.