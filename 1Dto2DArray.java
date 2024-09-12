class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] array = new int[m][n];

        //check if the 2d array can't be constructed
        if(m * n != original.length){
            array = new int[0][0];
            return array;
        }

        int index = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = original[index++];
            }
        }

        return array;
    }
}
