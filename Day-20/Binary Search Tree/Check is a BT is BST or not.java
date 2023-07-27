class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    boolean isValid(TreeNode root, Integer max, Integer min) {

        if(root == null)
            return true;

        if((max != null && root.val >= max) || (min != null && root.val <= min)) {
            return false;
        }

        return isValid(root.left, root.val, min) && isValid(root.right, max, root.val);
    }
}
