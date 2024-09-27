class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {    
        List<Integer> spiral = new ArrayList<>();

        int x = 0, y = matrix.length - 1, z = 0, w = matrix[0].length - 1;

        while(x <= y && z <= w){
            for(int i = z; i <= w; i++){
                spiral.add(matrix[x][i]);
            }
            x++;
            for(int i = x; i <= y; i++){
                spiral.add(matrix[i][w]);
            }        
            w--;
            if(x<=y){
                //go left
                for(int i = w; i >= z; i--){
                    spiral.add(matrix[y][i]);
                }
            }
            y--;
            if(z<=w){
                for(int i = y; i >= x; i--){
                    spiral.add(matrix[i][z]);
                }
            }
            z++;
        }
        return spiral;
    }
}
