class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int max=0;
      int arr[] = new int[nums.length-k+1];
      int r=0;
      for(int i=0;i<=nums.length-k;i++)
      {
         max=nums[i];
         for(int j =1;j<k;j++)
          {
            if(nums[i+j]>max)
             {
                max = nums[i+j];
             }
          }
         arr[r++] = max;
      }  
      return arr;
    }
}
