public class _404_sum_of_left_leaves {
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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        TreeNode curNode = root;
        if (curNode != null) {
            TreeNode leftNode = curNode.left;
            if (leftNode != null && leftNode.left ==  null && leftNode.right == null) {
                sum += leftNode.val;
            }

            sumOfLeftLeaves(curNode.left);
            sumOfLeftLeaves(curNode.right);
        }
        return sum;
    }
}
