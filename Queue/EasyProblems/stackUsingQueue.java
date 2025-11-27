package Queue.EasyProblems;

import java.util.*;

class myStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        // swap the names of two queues
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }

    public void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            q1.remove();
        }
    }

    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q1.peek();
    }

    public int size() {
        return q1.size();
    }
}

public class stackUsingQueue {
    public static void main(String[] args) {
        myStack st = new myStack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());

        System.out.println(st.size());
    }
}
