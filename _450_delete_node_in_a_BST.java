public class _450_delete_node_in_a_BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

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
