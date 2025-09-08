class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        Set<Character> set = new HashSet<>();
        int leftPointer = 0, rightPointer = 0;

        while(rightPointer < s.length()){
            if(!set.contains(s.charAt(rightPointer))){
                longestSubstring = Math.max(longestSubstring, rightPointer - leftPointer + 1);
            }
            else{
                while(set.contains(s.charAt(rightPointer))){
                    set.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
            }
            set.add(s.charAt(rightPointer));
            rightPointer++;
        }
        
        return longestSubstring;
    }
}
