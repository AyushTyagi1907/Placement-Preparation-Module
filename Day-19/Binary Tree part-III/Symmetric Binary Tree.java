class Solution {
    public boolean isSymmetric(TreeNode root) {

        return validator(root, root);

    }

    private boolean validator(TreeNode left, TreeNode right) {
        return left == null && right == null   // both null 
                  || left != null && right != null   // both not null  and same value
                  && left.val == right.val 
                  && validator(left.left, right.right)            
                  && validator(left.right, right.left);
    }
}
