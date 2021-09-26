package tree;

public class main_tree {

    public static void main(String[] args) {
        // MyBinaryTree myBinaryTree = new MyBinaryTree();

        // myBinaryTree.init();
        // System.out.println("DONE");


        // -------------------- Binary Search Tree ----------------------------------
        //              5
        //      1              6
        //  0        3           7
        //         2
        MyBinarySearchTree myTree = new MyBinarySearchTree();
        myTree.root = myTree.insertNode(myTree.root, 5);
        myTree.root = myTree.insertNode(myTree.root, 1);
        myTree.root = myTree.insertNode(myTree.root, 6);
        myTree.root = myTree.insertNode(myTree.root, 0);
        myTree.root = myTree.insertNode(myTree.root, 3);
        myTree.root = myTree.insertNode(myTree.root, 7);
        myTree.root = myTree.insertNode(myTree.root, 2);

        // myTree.deleteNode(myTree.root, 1);

        // TreeNode root_2 = myTree.searchBST(myTree.root, 2);
        myTree.PreOrder(myTree.root); // 5 1 0 3 2 6 7
        System.out.println();

        myTree.InOrder(myTree.root); // 0 1 2 3 5 6 7
        System.out.println();

        myTree.PostOrder(myTree.root); // 0 2 3 1 7 6 5
        System.out.println();

        System.out.println("DONE");
    }
}
