class Solution {
    public int maxProduct(int[] nums) {
        int maxProductGlobal = nums[0];

        int maxProduct = nums[0];
        int minProduct = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != 0){
                int tempMaxProduct = maxProduct;

                maxProduct = Math.max(nums[i], Math.max(nums[i] * maxProduct, nums[i] * minProduct));
                minProduct = Math.min(nums[i], Math.min(nums[i] * tempMaxProduct, nums[i] * minProduct));
            }
            else{
                maxProduct = 0;
                minProduct = 0;
            }
            maxProductGlobal = Math.max(maxProductGlobal, maxProduct);
        }

        return maxProductGlobal;
    }
}
