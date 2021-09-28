public class _112_path_sum {
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

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public boolean check(TreeNode curNode, int curSum, int targetSum) {
        if (curNode == null) {
            return false;
        }

        curSum += curNode.val;
        if (isLeaf(curNode)) {
            return curSum == targetSum;
        }

        boolean checkLeft = check(curNode.left, curSum, targetSum);
        if (checkLeft) {
            return true;
        }

        boolean checkRight = check(curNode.right, curSum, targetSum);
        if (checkRight) {
            return true;
        }

        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root, 0, targetSum);
    }
}
