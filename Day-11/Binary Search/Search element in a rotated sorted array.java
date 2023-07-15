class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target){
                return mid;
            }else{
                boolean inLeft = (nums[mid] >= target) && (target >= nums[lo]);
                boolean inRight = (nums[hi] >= target) && (target >= nums[mid]);
                if(inLeft){
                    hi = mid - 1;
                }else if(inRight){
                    lo = mid + 1;
                }else{
                    if(nums[mid] >= Math.max(nums[lo], nums[hi])){
                        lo = mid + 1;
                    }else{
                        hi = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
