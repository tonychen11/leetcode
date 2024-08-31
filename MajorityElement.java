class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int majority = nums.length / 2;

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);

            if(map.get(i) > majority){
                return i;
            }
        }

        return -1;
    }

    public int majorityElementMoores(int[] nums) {
        //moore's voting algorithm
        //if there's a majority element, it will always remain in the lead even counting other elements
        int count = 0;
        int majorityElement = nums[0];

        for(int i : nums){
            //reset majority element to current number
            if(count == 0){
                majorityElement = i;
            }

            //if majority element is encountered again, increase count
            if(majorityElement == i){
                count++;
            }
            else{
                count--;
            }
        }

        return majorityElement;
    }
}
