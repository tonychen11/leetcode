class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int leftPointer = 0;
        int rightPointer = leftPointer + k  - 1;
        double sum = 0;

        for(int i = leftPointer; i <= rightPointer; i++){
            sum += nums[i];
        }

        double max = sum;
        rightPointer++;

        while(rightPointer < nums.length){
            sum = sum - nums[leftPointer] + nums[rightPointer];
            max = Math.max(max, sum);
            leftPointer++;
            rightPointer++;
        }

        return max / k;
    }
}
