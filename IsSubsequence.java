class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        int sLength = s.length();
        int tLength = t.length();

        while(sPointer < sLength && tPointer < tLength){
            if(s.charAt(sPointer) != t.charAt(tPointer)){
                tPointer++;
            }
            else{
                sPointer++;
                tPointer++;
            }
        }
        
        if(tPointer == tLength && sPointer != sLength){
            return false;
        }

        return true;
    }
}
