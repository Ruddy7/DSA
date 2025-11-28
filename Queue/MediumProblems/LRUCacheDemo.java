package Queue.MediumProblems;

//Simple Implementation - Array. Hit - O(n), Miss - O(n), where n is capacity of cache
//Efficient Implementation - HashMap + Doubly Linked List. Hit - O(1), Miss - O(1)

import java.util.*;

class Node {
    Node next, prev;
    int key, value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null)
            return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {

        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            if (map.size() > capacity) {
                Node tailPrev = removeTail();
                map.remove(tailPrev.key);
            }
        }
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private Node removeTail() {
        Node tailPrev = tail.prev;
        removeNode(tailPrev);
        return tailPrev;
    }
}

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); // capacity 2
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // prints 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // prints -1 (not found)
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // prints -1 (not found)
        System.out.println(cache.get(3)); // prints 3
        System.out.println(cache.get(4)); // prints 4
    }
}
