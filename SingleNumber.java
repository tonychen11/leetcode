class Solution {
    public int singleNumber(int[] nums) {
        //hashset to store numbers, if number exists then remove it
        //the remaining number is the single number

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                set.remove(i);
            }
        }

        return set.iterator().next();
    }

    public int singleNumberXor(int[] nums) {
        //use xor transitive property
        //a ^ b ^ b ^ c ^ c = a

        int singleNumber = 0;

        for(int i : nums){
            singleNumber ^= i;
        }

        return singleNumber;

    }
}
