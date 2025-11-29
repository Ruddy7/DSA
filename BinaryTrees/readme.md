Each Binary tree has 3 parts - Node, left pointer, right pointer <br>
// Node structure <br>
class Node { <br>
int key; <br>
Node left, right; <br>
public Node(int item) <br>
{ <br>
key = item; <br>
left = right = null; <br>
} <br>
} <br> <br>

Properties <br>
The maximum number of nodes at level L of a binary tree is 2L. <br>
The maximum number of nodes in a binary tree of height H is 2H+1 – 1. <br>
Total number of leaf nodes in a binary tree = total number of nodes with 2 children + 1. <br>
In a Binary Tree with N nodes, the minimum possible height or the minimum number of levels is ⌊log2N⌋. <br>
A Binary Tree with L leaves has at least ⌈log2L⌉+ 1 levels. <br><br>

Operations<br>
Traversal, Search, Insertion. <br>
In Traversal, DFS and BFS. In DFS, In order, pre order, post order. In BFS, Level order and Zig Zag Traversal.
