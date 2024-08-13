class Solution {
    public int missingNumber(int[] nums) {
        //all the numbers added up from 0 to n is n * (n+1) / 2

        int sum = 0;
        int largestInt = nums.length; //9

        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; //37
        }
        
        int totalSum = largestInt * (largestInt + 1) / 2;

        return totalSum - sum;
    }


    //any number xor with itself is 0
    //1 xor 0 = 1
    //a^b^b = a
    //apply xor to 0 through n, as well as values in nums array. Outstanding value is missing number

    public int missingNumberXor(int[] nums) {
        int xor = nums.length;

        for(int i = 0; i < nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }

        return xor;
    }

}
