class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
      
        int[] arrMap = new int[26];

        for(char c : s.toCharArray()){
            arrMap[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            arrMap[c - 'a']--;
        }

        for(int i : arrMap){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}
