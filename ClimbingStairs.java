class Solution {
    public int climbStairs(int n) {
        //dfs recursion
        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairsMemoized(int n) {
        //dfs recursion with memoization
        int[] memoizedArray = new int[n + 1];
        memoizedArray[0] = 1;
        memoizedArray[1] = 1;

        return dfs(n, memoizedArray);
    } 

    public int dfs(int n, int[] arr){
        //check if answer is memoized
        if(arr[n] != 0){
            return arr[n];
        }

        //save memoized answer
        arr[n] = dfs(n - 1, arr) + dfs(n -2, arr);

        return arr[n];
    }


    public int climbStairsDP(int n) {
        //dfs recursion with memoization
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
