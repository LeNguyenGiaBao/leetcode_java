package tree;

public class MyBinaryTree {
    public TreeNode root;

    public MyBinaryTree() {

    }

    public void init() {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n4.left = n6; n4.right = n7;
        n2.right = n5;

        this.root = n0;
    }
}
