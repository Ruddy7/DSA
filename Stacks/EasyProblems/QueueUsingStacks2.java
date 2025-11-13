package Stacks.EasyProblems;

import java.util.*;

//In this approach, we will do dequeue Amortized O(1), worst case O(n) and enqueue, front and size O(1).

class myQueue2 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }

    int front() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }

        if (!s1.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
        return -1;
    }

    int size() {
        return s1.size() + s2.size();
    }
}

public class QueueUsingStacks2 {
    public static void main(String[] args) {
        myQueue2 q = new myQueue2();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());

        q.dequeue();
        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());
    }
}
