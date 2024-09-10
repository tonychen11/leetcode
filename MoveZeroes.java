class Solution {
    public void moveZeroes(int[] nums) {
        //move all non zeroes to start of string
        //keep track of left pointer where the swap occurs and update when there is a swap

        int leftPointer = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int tempLeft = nums[leftPointer];
                nums[leftPointer] = nums[i];
                nums[i] = tempLeft;
                leftPointer++;
            }
        }
    }
}
