class NumArray {
    private int[] nums;
    private int[] dp;

    public NumArray(int[] nums) {
        this.nums = nums;

        dp = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            dp[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        //brute force approach
        int sum = 0;

        for(int i = left; i <= right; i++){
            sum += nums[i];
        }

        return sum;
    }

    public int sumRangeDp(int left, int right) {
        //(2,5) = (0,5) - (0,1)
        //(3,4) = (0,4) - (0,2)
        //(1,2) = (0,2) - (0,0)
        
        //store the sums of (0,1), (0,2), (0,3), etc in an array
        //these values can be reused 

        if(left == 0){
            return dp[right];
        }

        int result = dp[right] - dp[left - 1];

        return result;
    }
}
