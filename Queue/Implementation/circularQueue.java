package Queue.Implementation;

import java.util.*;

//Implementing Circular Queue using Array

class myCircularQueue {
    private int[] arr;
    private int front;
    private int capacity;
    private int size;

    public myCircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        front = 0;
    }

    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int res = arr[front];
        front = (front + 1) % capacity;
        size--;
        return res;
    }

    public int getRear() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int rear = (front + size - 1) % capacity;
        return arr[rear];
    }

    public int getFront() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }
}

public class circularQueue {
    public static void main(String[] args) {
        myCircularQueue q = new myCircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getFront() + " " + q.getRear());
        q.dequeue();
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(40);
        System.out.println(q.getFront() + " " + q.getRear());
    }
}

// Summary:

// To add elements, do rear = (front + size) % capacity and add to arr[rear]
// To remove elements , do front = (front + 1) % capacity after returning
// arr[front] as dequeued element.
// To get front element, just return arr[front]
// and lastly to return rear element, rear = (front + size -1) % capacity and
// then return arr[rear].