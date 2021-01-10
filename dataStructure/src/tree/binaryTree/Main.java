package tree.binaryTree;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{10,20,30,40,50,60,70,80,90,100};

//      creating a tree
        Tree tree = new Tree();


        tree.insertLevelOrder(data);

        tree.depth();

        tree.search(1000);

        tree.delete(100);
        tree.delete(1000);

        System.out.print("printLevelOrderTraversal():\t");
        tree.printLevelOrderTraversal();
        System.out.println();

        System.out.print("printPreOrder():\t");
        tree.printPreOrder();
        System.out.println();

        System.out.print("printInOrder():\t");
        tree.printInOrder();
        System.out.println();

        System.out.print("printPostOrder():\t");
        tree.printPostOrder();
        System.out.println();


    }
}
