class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use hashset, if number doesn't exist put it in
        //if it exists, return true

        Set<Integer> duplicate = new HashSet<>();

        for(int i : nums){
            if(!duplicate.contains(i)){
                duplicate.add(i);
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}
