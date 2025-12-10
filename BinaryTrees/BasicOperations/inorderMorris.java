package BinaryTrees.BasicOperations;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int var1) {
        this.data = var1;
        this.left = this.right = null;
    }
}

public class inorderMorris {

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                ans.add(curr.data);
                curr = curr.right;
            } else {
                Node prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // Representation of input binary tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = inOrder(root);

        for (int data : res) {
            System.out.print(data + " ");
        }
    }
}
