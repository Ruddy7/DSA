package Stacks.Implementation;

//Implementing Stacks using Linked List

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class myStack {
    private Node top;

    public myStack() {
        top = null;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        Node temp = top;
        top = top.next;
        int val = temp.data;

        temp = null;
        return val;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        myStack st = new myStack();

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
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));
    }
}
