package tree;

public class main_tree {

    public static void main(String[] args) {
        // MyBinaryTree myBinaryTree = new MyBinaryTree();

        // myBinaryTree.init();
        // System.out.println("DONE");


        // -------------------- Binary Search Tree ----------------------------------
        MyBinarySearchTree myTree = new MyBinarySearchTree();
        myTree.root = myTree.insertNode(myTree.root, 5);
        myTree.root = myTree.insertNode(myTree.root, 1);
        myTree.root = myTree.insertNode(myTree.root, 6);
        myTree.root = myTree.insertNode(myTree.root, 0);
        myTree.root = myTree.insertNode(myTree.root, 3);
        myTree.root = myTree.insertNode(myTree.root, 7);
        myTree.root = myTree.insertNode(myTree.root, 2);

        myTree.deleteNode(myTree.root, 1);

        TreeNode root_2 = myTree.searchBST(myTree.root, 2);
        System.out.println("DONE");
    }
}
