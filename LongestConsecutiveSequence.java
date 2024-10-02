class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestSequence = 0;

        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            int count = 1;
            int currentNumber = i;
            if(!set.contains(currentNumber + 1)){
                while(set.contains(currentNumber - 1)){
                    count++;
                    currentNumber--;
                }
                longestSequence = Math.max(longestSequence, count);
            } 
        }

        return longestSequence;   
    }
}
