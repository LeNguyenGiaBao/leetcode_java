package tree;

public class MyBinarySearchTree {
    public TreeNode root;

    public MyBinarySearchTree() {

    }

    public TreeNode insertNode(TreeNode root, int value) {

        // root is null
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else {
            TreeNode newNode = new TreeNode(value);
            TreeNode tempNode = root;
            while (true) {
                if (value < tempNode.val) {
                    if (tempNode.left == null) {
                        tempNode.left = newNode;
                        break;
                    } else {
                        tempNode = tempNode.left;
                    }
                } else if (value > tempNode.val) {
                    if (tempNode.right == null) {
                        tempNode.right = newNode;
                        break;
                    } else {
                        tempNode = tempNode.right;
                    }
                }
            }
            return root;
        }
    }
}
