class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = nums[0], currentMax = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(nums[i], nums[i] + currentMax);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;        
    }
}
