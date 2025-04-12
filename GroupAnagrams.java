class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            int[] arr = new int[26];

            for(char ch : c){
                arr[ch - 'a']++;
            }

            String arr1 = Arrays.toString(arr);

            if(!map.containsKey(arr1)){
                map.put(arr1, new ArrayList<>());
            }
            map.get(arr1).add(s);
        }

        return new ArrayList(map.values());
    }
}
