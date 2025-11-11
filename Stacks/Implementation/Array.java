package Stacks.Implementation;

//Implementing Stacks using Array - Fixed Size Stack

import java.util.*;

class myStack {
    private int[] arr;
    private int capacity;
    private int top;

    public myStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class Array {
    public static void main(String[] args) {
        myStack st = new myStack(4);
        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                (st.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " +
                (st.isFull() ? "Yes" : "No"));

    }
}
