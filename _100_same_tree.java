public class _100_same_tree {
    public static class TreeNode {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p.val != q.val) {
            return false;
        }

        if (p.left != null && q.left != null) {
            boolean left = isSameTree(p.left, q.left);
            if (left == false) {
                return false;
            } 
        } else {
            if (p.left != null || q.left != null) {
                return false;
            }
        }

        if (p.right != null && q.right != null) {
            boolean right = isSameTree(p.right, q.right);
            if (right == false) {
                return false;
            } 
        } else {
            if (p.right != null || q.right != null) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(1);

        a1.left = a2;
        a4.right = a3;

        boolean result = isSameTree(a1, a4);
        System.out.println(result);
    }
}