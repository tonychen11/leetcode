class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(maxIndex < i){
                return false;
            }

            if(i + nums[i] >= nums.length){
                return true;
            }
          
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;
    }
}
