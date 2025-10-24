class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2){
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c : s1.toCharArray()){
            arr1[c - 'a']++;
        }

        for(int i = 0; i < len1; i++){
            arr2[s2.charAt(i) - 'a']++;
        }

        if(match(arr1, arr2)){
            return true;
        }

        int left = 0, right = len1;
        while(right < len2){
            char letterAtRight = s2.charAt(right);
            char letterAtLeft = s2.charAt(left);

            arr2[letterAtRight - 'a']++;
            arr2[letterAtLeft - 'a']--;
            left++;
            right++;

            if(match(arr1, arr2)){
                return true;
            }
        }

        return false;           
    }

    public boolean match(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
