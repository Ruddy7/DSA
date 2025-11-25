package Queue.Implementation;

import java.util.*;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class myQueue2 {
    private Node front;
    private Node rear;
    private int currSize;

    public myQueue2() {
        currSize = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public int size() {
        return currSize;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        currSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        Node temp = front;
        int removedData = front.data;
        front = front.next;

        if (front == null)
            rear = null; // If the front becomes null, also set rear = null (queue becomes empty).

        currSize--;
        return removedData;
    }
}

public class usingLinkedList {
    public static void main(String[] args) {
        myQueue2 q = new myQueue2();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Dequeue: " + q.dequeue());

        q.enqueue(30);

        System.out.println("Front: " + q.getFront());
        System.out.println("Size: " + q.size());
    }
}
