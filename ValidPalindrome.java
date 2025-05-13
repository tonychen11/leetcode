class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String lowerCase = s.toLowerCase();

        while(left < right){
            if(!Character.isLetterOrDigit(lowerCase.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(lowerCase.charAt(right))){
                right--;
            }
            else{
                if(lowerCase.charAt(left++) != lowerCase.charAt(right--)){
                    return false;
                }
            }
        }
        return true;
    }
}
