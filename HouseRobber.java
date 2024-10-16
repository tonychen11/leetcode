class Solution {
    public int rob(int[] nums) {
        int[] maxMoney = new int[nums.length + 1];
        maxMoney[0] = 0;
        maxMoney[1] = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxMoney[i + 1] = Math.max(nums[i] + maxMoney[i - 1], maxMoney[i]);
        }

        return maxMoney[nums.length];
    }
}
