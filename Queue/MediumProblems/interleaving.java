package Queue.MediumProblems;
//Given a queue q[] of even size. Rearrange the elements by interleaving the first half with the second half.

//Note:Interleaving means take one element from the first half,then one element from the second half,then the next element from the first half,then the next element from the second half,and continue this process until the queue is fully rearranged.

import java.util.*;

public class interleaving {
    public static void rearrangeQueue(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        Queue<Integer> secondHalf = new LinkedList<>();
        int half = q.size() / 2;

        for (int i = 0; i < half; i++) {
            firstHalf.add(q.poll());
        }

        while (!q.isEmpty()) {
            secondHalf.add(q.poll());
        }

        while (!secondHalf.isEmpty() && !firstHalf.isEmpty()) {
            q.add(firstHalf.poll());
            q.add(secondHalf.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);
        System.out.println("Original Queue: " + q);
        rearrangeQueue(q);
        System.out.println("After Interleaving halves: " + q);
    }
}
