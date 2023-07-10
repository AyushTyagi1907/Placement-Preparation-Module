class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for(int i=0;i<height.length-1;i++){
            int result = i+1;
            int biggest = height[i+1];
            int biggesti = i+1;
            for(int j=i+1;j<height.length;j++){
                if(height[j] > biggest){
                    biggest = height[j];
                    biggesti = j;
                }
                result = j;
                if(height[j] >= height[i]) 
                break;
            }
            sum += addUp(height, i, biggesti);
            i = biggesti-1;
        }
        return sum;
    }
    int addUp(int[] height, int start, int end){
        if(end-start == 1) return 0;
        int max = Math.min(height[start], height[end]);
        int sum = 0;
        for(int i=start+1;i<end;i++){
            sum += max - height[i];
        }
        return sum;
    }
}
