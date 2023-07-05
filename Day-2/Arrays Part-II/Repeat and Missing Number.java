public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int n = a.length; // Size of array 'a'

        int []count = new int[n + 1]; // 'count' array
        for(int i = 0; i < n; ++i) {
            // Incrementing the frequency of current element
            ++count[a[i]];
        }
        int missing = 0;
        int repeating = 0;
        for(int i = 1; i <= n; ++i) {
            if(count[i] == 0) missing = i;
            else if(count[i] == 2) repeating = i;
        }
        int []ans = new int[2];
        ans[0] = repeating;
        ans[1] = missing;
        return ans;
    }
}
