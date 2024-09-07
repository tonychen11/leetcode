class Solution {
     public int[] sortedSquares(int[] nums) {
        //two pointers at both ends
        //move both pointers inwards towards middle until they intersect, find the biggest square at each comparison

        int left = 0, right = nums.length - 1;
        int[] squares = new int[nums.length];
        int index = nums.length - 1;

        while(left <= right){
            if(Math.pow(nums[left], 2) < Math.pow(nums[right], 2)){
                squares[index] = (int)Math.pow(nums[right], 2);
                index--; 
                right--;
            }
            else{
                squares[index] = (int)Math.pow(nums[left], 2);
                index--;
                left++;
            }
        }
        return squares;
     }
}
