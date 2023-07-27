public static void findPreSuc(Node root, int key)
{
    // code here.
    if (root == null) return ;
    
    	// If key is present at root
    	if (root.data == key)
    	{
    		// the maximum value in left subtree is predecessor
    		if (root.left != null)
    		{
    			Node tmp = root.left;
    			while (tmp.right!=null)
    				tmp = tmp.right;
    			pre = tmp ;
    		}
    
    		// the minimum value in right subtree is successor
    		if (root.right != null)
    		{
    			Node tmp = root.right ;
    			while (tmp.left!=null)
    				tmp = tmp.left ;
    			suc = tmp ;
    		}
    		return ;
    	}
    
    	// If key is smaller than root's key, go to left subtree
    	if (root.data > key)
    	{
    		suc = root ;
    		findPreSuc(root.left, key) ;
    	}
    	else // go to right subtree
    	{
    		pre = root ;
    		findPreSuc(root.right, key) ;
    	}
}
}
