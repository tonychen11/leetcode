class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis = 1;
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        for(int i = nums.length - 2; i >= 0; i--){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    arr[i] = Math.max(arr[i], 1 + arr[j]);
                }
            }
            if(arr[i] > lis){
                lis = arr[i];
            }
        }

        return lis;
    }
}
