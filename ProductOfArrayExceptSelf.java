class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] backward = new int[nums.length];
        backward[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >= 0; i--){
            backward[i] = backward[i + 1] * nums[i + 1];
        }

        int currentProduct = nums[0];

        for(int i = 1; i < nums.length; i++){
            backward[i] = currentProduct * backward[i];
            currentProduct *= nums[i];
        }
        
        return backward;
    }
}
