class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }
    public void postOrder(TreeNode root, ArrayList<Integer> result){
        if(root==null){
            return;  
        }
        //recursively call postOrder on the left subtree
        postOrder(root.left,result); 
        //recursively call postOrder on the right subtree
        postOrder(root.right,result); 
        //add the current node's value to the result list
        result.add(root.val); 
    }
}
