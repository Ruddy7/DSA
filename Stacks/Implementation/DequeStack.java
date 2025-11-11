package Stacks.Implementation;

//Implement a stack using a deque (double-ended queue) data structure.
//A doubly ended queue or deque allows insertion and deletion at both ends.
//In a stack, we need to do insertions and deletions at one end only. We can use either end of deque (front or back) to implement a stack.
//In the below implementation, we use back (or rear) of stack to do both insertions and deletions.

import java.util.*;

public class DequeStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
    }
}
