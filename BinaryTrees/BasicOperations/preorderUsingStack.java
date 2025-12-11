package BinaryTrees.BasicOperations;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class preorderUsingStack {
    public static ArrayList<Integer> preOrderStack(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            Node curr = s.pop();
            ans.add(curr.data);
            if (curr.right != null)
                s.add(curr.right);
            if (curr.left != null)
                s.add(curr.left);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = preOrderStack(root);

        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
