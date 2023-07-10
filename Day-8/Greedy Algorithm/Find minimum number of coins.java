class Solution{
    static List<Integer> minPartition(int N)
    {
        int[] denom = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int[] dp = new int[N+1];
        int[] dp2 = new int[N+1];
        dp[0] = 0;
        dp2[0] = 0;
        
        for(int i = 1; i <= N; i++){
	        dp[i] = Integer.MAX_VALUE;
	        dp2[i] = -1;
	    }
	    for(int j = 0; j < 10; j++){
	        for(int i = 1; i <= N; i++){
	            if(i >= denom[j]){
	                dp[i] = Integer.min(dp[i], 1+dp[i-denom[j]]);
	                dp2[i] = j;
	            }
            }
        }
        
        int k = N;
        List<Integer> num = new ArrayList<Integer>();
        for(int i = N; i> 0 && N >= 0;){
            if(dp2[i] != -1)
                num.add(denom[dp2[i]]);   
            N = N - denom[dp2[i]];
            i = N;
        }
        return num;
    }
}
