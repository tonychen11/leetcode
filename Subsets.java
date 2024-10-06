class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, subsets, new ArrayList<>(), 0);
        return subsets;
    }

    public void backtrack(int[] nums, List<List<Integer>> subsets, List<Integer> currentSubset, int index){
        if(index == 0){
            subsets.add(currentSubset);
        }
        
        for(int i = index; i < nums.length; i++){
            currentSubset.add(nums[i]);
            List<Integer> temp = new ArrayList<>(currentSubset);
            subsets.add(temp);
            backtrack(nums, subsets, currentSubset, i + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
