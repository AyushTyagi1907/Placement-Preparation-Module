class Solution
{
    int count =0;
    int result = -1;
	void kthLargestUtil(Node root, int k ) 
    { 
        
        if (root == null || count >= k) 
            return; 
        kthLargestUtil(root.right, k);  
        count++;

        if (count == k) { 
            result = root.data;
            return; 
        }
        kthLargestUtil(root.left, k);
    } 
  
    int kthLargest(Node root, int k) 
    { 
        kthLargestUtil(root, k); 
        return result;
    } 
}
