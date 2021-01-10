package tree.binaryTree;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[]{10,20,30,40,50,60,70,80,90,100};
        Tree tree = new Tree();
        tree.insertLevelOrder(data);

        System.out.println("preOrder");
        tree.printPreOrder();
        System.out.println();

        System.out.println("inOrder");
        tree.printInOrder();
        System.out.println();

        System.out.println("PostOrder");
        tree.printPostOrder();
        System.out.println();


    }
}
