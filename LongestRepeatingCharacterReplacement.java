class Solution {
    public int characterReplacement(String s, int k) {
        int leftPointer = 0, rightPointer = 0;
        int longestSubstring = 1;
        int[] arr = new int[26];
        int maxCount = 0;

        while(rightPointer < s.length()){
            int test = ++arr[s.charAt(rightPointer) - 'A'];
            maxCount = Math.max(maxCount, test);

            if(rightPointer - leftPointer + 1 - maxCount > k){
                arr[s.charAt(leftPointer) - 'A']--;
                leftPointer++;     
            }
            rightPointer++;
            longestSubstring = Math.max(longestSubstring, rightPointer - leftPointer);
        }

        return longestSubstring;
    }
}
