public class _993_cousins_in_binary_tree {
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

    public static int getPath(TreeNode root, int x, int currentPath) {
        if (root == null) {
            return -1;
        }

        if (root.val == x) {
            return currentPath;
        }

        int pathLeft = getPath(root.left, x, currentPath + 1);
        int pathRight = getPath(root.right, x, currentPath + 1);

        return Math.max(pathLeft, pathRight);
    }

    public static boolean isBrother(TreeNode root, int x, int y) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                if ((root.left.val == x && root.right.val == y) 
                    || ((root.left.val == y && root.right.val == x))) {
                    return true;
                } else {
                    boolean isLeft = isBrother(root.left, x, y);
                    boolean isRight = isBrother(root.right, x, y);
                    if (isLeft || isRight) {
                        return true;
                    }
                }
            }

            if (root.left != null) {
                boolean isLeft = isBrother(root.left, x, y);
                if (isLeft) {
                    return true;
                }
            }

            if (root.right != null) {
                boolean isRight = isBrother(root.right, x, y);
                if (isRight) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        int pathX = getPath(root, x, 0);
        int pathY = getPath(root, y, 0);

        if (pathX == pathY) {
            if (!isBrother(root, x, y)) {
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        // n1.left = n2;
        // n1.right = n3;
        // n2.right = n4;
        // n3.left = n5;

        // n1.right = n2;
        // n2.left = n3;
        // n2.right = n5;
        // n3.left = n4;

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        
        // int path = getPath(n1, 6, 0);
        // System.out.println(path);

        boolean checkBrother = isCousins(n1, 5, 4);
        System.out.println(checkBrother);
    }
}
