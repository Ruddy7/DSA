package BinaryTrees.EasyProblems;

import java.util.*;
//Finding a subtree with given sum

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class givenSum {

    static int subTreeSum(Node root, boolean[] foundSum, int target) {
        if (root == null)
            return 0;

        int currentSum = root.data + subTreeSum(root.left, foundSum, target) + subTreeSum(root.right, foundSum, target);

        if (currentSum == target)
            foundSum[0] = true;

        return currentSum;
    }

    static boolean hasSubtreeWithSum(Node root, int target) {
        boolean[] foundSum = new boolean[1];
        subTreeSum(root, foundSum, target);
        return foundSum[0];
    }

    public static void main(String[] args) {
        // Creating the given binary tree
        // 1
        // / \
        // 3 6
        // / \ /
        // 5 9 8

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(5);
        root.left.right = new Node(9);
        root.right.left = new Node(8);

        System.out.println(hasSubtreeWithSum(root, 17));
    }
}
