class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int firstIndex = map.get(target - nums[i]);
                int[] indices = new int[]{firstIndex, i};
                return indices;
            }
            else{
                map.put(nums[i], i);
            }
        }
      
        return new int[]{};
    }
}
