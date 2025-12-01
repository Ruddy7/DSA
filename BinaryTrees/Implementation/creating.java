package BinaryTrees.Implementation;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class creating {
    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
    }
}
