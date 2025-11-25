package Queue.Implementation;

import java.util.*;

class myQueue {
    private int[] arr;
    private int capacity;
    private int size;

    public myQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        arr[size] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[size - 1];
    }
}

public class usingArray {
    public static void main(String[] args) {
        myQueue q = new myQueue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front: " + q.getFront());

        q.dequeue();
        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());

        q.enqueue(40);
    }
}
