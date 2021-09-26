package tree;

public class MyBinarySearchTree {
    public TreeNode root;

    public MyBinarySearchTree() {

    }

    public TreeNode insertNode(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);

        // root is null
        if (root == null) {
            root = newNode;
            return root;
        } else {
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

    // find the final left of the root
    public TreeNode findLeftMostNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        
        return leftMostNode;
    }

    // recursion function: return root that deleted key node
    public TreeNode deleteNode(TreeNode root, int key) {

        // check root is null
        if (root == null) {
            return null;
        }

        // find key node
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // remove node

            // node is leaf
            if (root.left == null && root.right == null) {
                return null;
            }

            // node has only left child node
            if (root.left != null && root.right == null) {
                return root.left;
            }

            // node has only right child node
            if (root.left == null && root.right != null) {
                return root.right;
            }

            // root has both child
            // find the left most node of the right child tree
            TreeNode leftMostNode = findLeftMostNode(root.right);
            root.val = leftMostNode.val;
            root.right = deleteNode(root.right, leftMostNode.val);
        }


        return root;
    }
}
