package Stacks.EasyProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Reversing first K elements of a queue using Stack

public class reverseFirstK {
    public static void reverseFirstKelements(Queue<Integer> q, int k) {
        if (k > q.size() || q.isEmpty() || k <= 0)
            return;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        reverseFirstKelements(q, k);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
