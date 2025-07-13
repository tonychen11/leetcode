class Solution {
    public int trap(int[] height) {
        int[] maxHeightForward = new int[height.length];
        int[] maxHeightBackward = new int[height.length];

        int maxHeightF = 0;
        for(int i = 0; i < height.length; i++){
            if(height[i] > maxHeightF){
                maxHeightF = height[i];
            }
            maxHeightForward[i] = maxHeightF;
        }

        int maxHeightB = 0;
        for(int i = height.length - 1; i >= 0 ; i--){
            if(height[i] > maxHeightB){
                maxHeightB = height[i];
            }
            maxHeightBackward[i] = maxHeightB;
        }

        int trappedWater = 0;
        for(int i = 0; i < height.length; i++){
            int minHeight = Math.min(maxHeightForward[i], maxHeightBackward[i]);
            if(minHeight > height[i]){
                trappedWater += minHeight - height[i];
            }  
        }

        return trappedWater
    }
}
