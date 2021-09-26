import java.util.ArrayList;
import java.util.List;

public class _144_binary_tree_preorder_traversal {

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

    List<Integer> preorder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return preorder;
        }
        
        preorder.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return preorder;
    }
}
