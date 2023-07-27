class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    HashMap<Integer,Integer> map = new HashMap<>(); //(elem,idx)
    for(int i = 0 ;i<inorder.length ;i++){
        map.put(inorder[i],i);
    }
    TreeNode root = Helper(postorder , 0 ,postorder.length-1,inorder,0,inorder.length-1,map);
    return root ;
}

public TreeNode Helper(int [] postorder , int ps  , int pe,
                       int [] inorder , int is,int ie ,HashMap<Integer,Integer> map){
    
    if(ps>pe || is>ie){
        return null;
    }
    TreeNode root = new TreeNode(postorder[pe]);
    int idx = map.get(postorder[pe]);
    int len = ie-idx ;
    
    root.left = Helper(postorder,ps,pe-len-1 , inorder , is,idx-1 ,map);
    root.right = Helper(postorder ,pe-len ,pe-1,inorder ,idx+1,ie,map);
    return root ;
}
}
