package BinaryTrees.BasicOperations;

import java.util.ArrayList;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class preorderMorris {
    public static ArrayList<Integer> preMorris(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        while (root != null) {
            if (root.left == null) {
                ans.add(root.data);
                root = root.right;
            } else {
                Node curr = root.left;
                while (curr.right != null && curr.right != root) {
                    curr = curr.right;
                }

                if (curr.right == root) {
                    curr.right = null;
                    root = root.right;
                } else {
                    ans.add(root.data);
                    curr.right = root;
                    root = root.left;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> ans = preMorris(root);

        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
