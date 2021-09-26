import java.util.ArrayList;
import java.util.List;

public class _94_binary_tree_inorder_traversal {
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

    List<Integer> inorder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return inorder;
        }

        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);

        return inorder;
    }
}
