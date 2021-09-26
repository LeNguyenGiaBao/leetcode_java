public class _701_insert_to_a_binary_search_tree {

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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        // check root is null
        if (root == null) {
            root = newNode;
        } else {
            TreeNode tempNode = root;
            while (true) {
                if (val < tempNode.val) {
                    if (tempNode.left == null) {
                        tempNode.left = newNode;
                        break;
                    } else {
                        tempNode = tempNode.left;
                    }
                } else {
                    if (val > tempNode.val) {
                        if (tempNode.right == null) {
                            tempNode.right = newNode;
                            break;
                        } else {
                            tempNode = tempNode.right;
                        }
                    }
                }
            }
        }
        return root;
    }
}
