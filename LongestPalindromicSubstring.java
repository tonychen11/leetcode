class Solution {
    private int start = 0;
    private int end = 0;

    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        for(int i = 1; i < s.length(); i++){
            expand(s, i - 1, i);
            expand(s, i, i);
        }

        return s.substring(start, end + 1);
    }

    public void expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        if(((right - 1) - (left + 1) + 1) > (end - start + 1)){
            start = left + 1;
            end = right - 1;
        }
    }
}
