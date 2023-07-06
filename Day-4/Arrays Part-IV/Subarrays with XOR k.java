public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        int count = 0; // number of subarrays
        // whose XOR is equal to 'b'

        int n = a.length; // Size of array 'a'
        for(int i = 0; i < n; ++i) {
            int curr = 0;
            for(int j = i; j < n; ++j) {
                curr ^= a[j];
                if(curr == b) {
                    // Increasing count
                    ++count;
                }
            }
        }
        return count;
    }
}
