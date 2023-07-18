class Solution {
    public int myAtoi(String str) {
        if (str== null || str.trim().isEmpty()) {
            return 0;
        }
        str = str.trim();
        int sign = (str.charAt(0) == '-')? -1 : 1;
        int start = (str.charAt(0) == '+' || sign==-1) ? 1: 0;
        
        long result = 0;
        int i=start;
        for (; i<str.length(); i++) {
            char curr = str.charAt(i);
            if (curr <'0' || curr>'9') {
                break;
            }
            
            result = (result*10) + curr-'0';
            if ((result*sign) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if ((result*sign) > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        if (i==start) {
            return 0;
        }
        return (int) (result*sign);
    }
}
