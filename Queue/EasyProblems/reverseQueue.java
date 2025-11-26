package Queue.EasyProblems;

import java.util.*;

public class reverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> s = new Stack<>();
        while (!queue.isEmpty()) {
            s.add(queue.poll());
        }

        while (!s.isEmpty()) {
            queue.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
