package BinaryTrees.BasicOperations;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class postOrderMorris {
    public static ArrayList<Integer> postMorris(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node current = root;

        while (current != null) {
            if (current.right == null) {
                ans.add(current.data);
                current = current.left;
            } else {
                Node predecessor = current.right;
                while (predecessor.left != null
                        && predecessor.left != current) {
                    predecessor = predecessor.left;
                }
                if (predecessor.left == null) {
                    ans.add(current.data);
                    predecessor.left = current;
                    current = current.right;
                } else {
                    predecessor.left = null;
                    current = current.left;
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> ans = postMorris(root);

        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
