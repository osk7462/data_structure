package tree.binaryTree;

import java.security.PublicKey;

public class Tree {
    Node root;

//    default constructor
    public Tree() {
        this(null);
    }

//    constructor with parameter
    public Tree(Node root) {
        this.root = root;
    }

    public void insertLevelOrder(int[] data) {
        this.root = insertLevelOrder(this.root, data, 0, data.length);
    }
    public Node insertLevelOrder(Node root, int[] data, int i, int n) {

        //baseline case for recursion.
        if (i < n) {
            root = new Node(data[i]);
            root.setLeft(insertLevelOrder(root.getLeft(), data, i*2+1, n));
            root.setRight(insertLevelOrder(root.getRight(), data, i*2+2, n));
        }
        return root;
    }

    public void printPreOrder() {
        printPreOrder(this.root);
    }

    public void printPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() +",");
        printPreOrder(root.getLeft());
        printPreOrder(root.getRight());
    }

    public void printInOrder() {
        printInOrder(this.root);
    }
    public void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.getLeft());
        System.out.print(root.getData() +",");
        printInOrder(root.getRight());
    }

    public void printPostOrder() {
        printPostOrder(this.root);
    }
    public void printPostOrder(Node root) {
        if (root == null) {
            return;
        }
        printPostOrder(root.getLeft());
        printPostOrder(root.getRight());
        System.out.print(root.getData() +",");
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }
}
