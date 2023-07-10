class Solution {
    public int removeDuplicates(int[] nums) {
        for(int tail = 1, head = 0; ; tail++)
            if(tail >= nums.length) return ++head;
            else if(nums[head] != nums[tail]) nums[++head] = nums[tail];
    }
}
