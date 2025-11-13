package Stacks.EasyProblems;

//enqueue(x): Insert element x at the end of the queue.
//dequeue(): Remove the element from the front of the queue. If the queue is empty, do nothing.
//front(): Return the element at the front of the queue. If the queue is empty, return -1.
//size(): Return the number of elements in the queue.
//Queue is first in first out (FIFO_) data structure.

import java.util.*;

//In this method enqueue has time complexity of O(n) while dequeue, front and size has O(1).
//In next approach, we will do dequeue Amortized O(1), worst case O(n) and enqueue, front and size O(1).

class myQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int x) {
        // Move all elements from s1 to s2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push new item into s1
        stack1.push(x);

        // Push everything back to s1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    void dequeue() {
        if (stack1.isEmpty()) {
            return;
        }
        stack1.pop();
    }

    int front() {
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.peek();
    }

    int size() {
        if (stack1.isEmpty()) {
            return -1;
        }
        return stack1.size();
    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        myQueue q = new myQueue();
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
