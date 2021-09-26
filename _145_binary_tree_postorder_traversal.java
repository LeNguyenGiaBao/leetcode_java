import java.util.ArrayList;
import java.util.List;

public class _145_binary_tree_postorder_traversal {
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

    List<Integer> postorder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return postorder;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorder.add(root.val);
        
        return postorder;
    }
}
