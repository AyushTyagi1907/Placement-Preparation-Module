class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr.get(k-1);
    }
    public static void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
