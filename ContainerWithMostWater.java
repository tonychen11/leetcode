class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;

        int mostWater = 0;

        while(left < right){
            int currentWater = (right - left) * Math.min(height[left], height[right]);
            mostWater = Math.max(mostWater, currentWater);

            if(height[left] > height[right]){
                right--;
            }
            else{
                left++; 
            }
        }
      
        return mostWater;
    }
}
