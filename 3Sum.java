class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            int sum = 0 - nums[i];

            while(leftPointer < rightPointer){
                if(nums[leftPointer] + nums[rightPointer] > sum){
                    rightPointer--;
                }
                else if(nums[leftPointer] + nums[rightPointer] < sum){
                    leftPointer++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[leftPointer]);
                    list.add(nums[rightPointer]);
                    triplets.add(list);
                    leftPointer++;
                    rightPointer--;

                    while(leftPointer < nums.length && nums[leftPointer] == nums[leftPointer - 1]){
                        leftPointer++;
                    }
                }             
            }
        }

        return triplets;
    }
}
