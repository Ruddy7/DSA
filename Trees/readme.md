**Basics** <br>
Parent-child relationship. Consists of nodes, topmost node is called root and every other node can have one or more child nodes.<br><br>

Basic Terminologies: <br>
Parent Node: A node that is an immediate predecessor of another node. <br>
Child Node: A node that is an immediate successor of another node. <br>
Root Node: The topmost node in a tree, which does not have a parent. <br>
Leaf Node (External Node): Nodes that do not have any children. <br>
Sibling: Nodes that share the same parent. <br>
Level of a Node: The number of edges in the path from the root to that node.The root node is at level 0. <br>
Internal Node: A node with at least one child. <br>
Neighbor of a Node: The parent or children of a node.<br>
Subtree: A node and all its descendants form a subtree.<br><br>

Tree is a non linear data structure because data is not stored sequentially in a tree but rather in a heirarchical order.<br><br>

Representation: <br>
// Node structure for tree in Java <br>
class Node { <br>
int data; <br>
List<Node> children; <br>

    Node(int x) { <br>
        data = x; <br>
        children = new ArrayList<>(); <br>
    } <br>

} <br><br>

Types of Trees - Ternary Tree (3 children max), N-ary Tree (Any number of children) but mostly used are Binary Trees (2 children max). <br>
Binary trees are the most used trees and it has another classification Binary Search Trees. These two topics we will be doing in depth. <br><br>

Basic Operations - Create, Insert, Search, Traversal - Depth First and Breadth First. <br><br>

Properties: <br>
Number of edges: An edge is the connection between two nodes. A tree with N nodes will always have N - 1 edges. <br>
Depth of a node: The depth of a node is the length of the path from the root to that node. Each edge in the path adds 1 unit to the length. Equivalently, it is the number of edges from the root to the node. <br>
Height of the tree: The height of the tree is the length of the longest path from the root to any leaf node. <br>
Degree of a node: The degree of a node is the number of subtrees attached to it (i.e., the number of children it has).
A leaf node has a degree of 0. <br>
The degree of the tree is the maximum degree among all nodes in the tree. <br>
