package tree.binaryTree;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

        if (i < n) {
            root = new Node(data[i]);
            root.setLeft(insertLevelOrder(root.getLeft(), data, i*2+1, n));
            root.setRight(insertLevelOrder(root.getRight(), data, i*2+2, n));
        }
        return root;
    }

    public void search(int data) {
        if (printLevelOrderTraversal(this.root,data,true))
            System.out.println("search()\t"+ data +" found");
        else
            System.out.println("search():\t"+ data +" not found");
    }

    public void delete(int data) {
        Node deleteNode = null;
        Node leafNode = null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.getData() == data)
                deleteNode = node;
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }

            if (node.getLeft() == null && node.getRight() == null) {
                leafNode = node;
            }
        }
        if (deleteNode != null) {
            deleteNode.setData(leafNode.getData());
            System.out.println("delete():\t" + leafNode.getData() + " successfully deleted ");
            leafNode = null;
        } else {
            System.out.println("delete():\t" + data +" is not found");
        }
    }

    public void depth() {
        System.out.println("depth():\tthe depth/height of this tree is: " + depth(this.root));
    }
    public int depth(Node root) {
        if (root == null)
            return 0;

        int lDepth = depth(root.getLeft());
        int rDepth = depth(root.getRight());
        if (lDepth > rDepth)
            return lDepth+1;
        else return rDepth +1;
    }

    public void printLevelOrderTraversal() {
        printLevelOrderTraversal(this.root,0,false);
    }
    public boolean printLevelOrderTraversal(Node root, int searchData, boolean search) {
        boolean isFound = false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (!search)
                System.out.print(node.getData() + ",");
//            this is for search purpose we can also add another method for search.
            if (node.getData() == searchData)
                isFound = true;
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return isFound;
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
