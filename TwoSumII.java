class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int[] twoSum = new int[2];

        while(leftPointer < rightPointer){
            int sum = numbers[leftPointer] + numbers[rightPointer];

            if(sum == target){
                twoSum = new int[]{leftPointer + 1, rightPointer + 1};
                return twoSum;
            }
            else if(sum > target){
                rightPointer--;
            }
            else{
                leftPointer++;
            }
        }
        
        return twoSum;
    }
}
