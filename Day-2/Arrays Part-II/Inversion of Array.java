public class Solution {
    public static int numberOfInversions(int []a, int n) {
        int answer = 0;

        // For all elements in 'a'.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // If the pair (i,j) satisfying the
                // condition for inversion.
                if (a[i] > a[j]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
