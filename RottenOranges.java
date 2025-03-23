class Solution {
    public int orangesRotting(int[][] grid) {
        int rowLen = grid.length;
        int columnLen = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int freshOranges = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i, j, 0});
                }
                if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }

        if(freshOranges == 0){
            return 0;
        }

        int timeT = 0;
        int[][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                int[] cell = queue.poll();
                int row = cell[0];
                int column = cell[1];
                int time = cell[2];

                for(int[] direction : directions){
                    int newRow = row + direction[0];
                    int newColumn = column + direction[1];

                    if(newRow < 0 || newColumn < 0 || newRow == rowLen || newColumn == columnLen){
                        continue;
                    }
                  
                    if(grid[newRow][newColumn] == 1){
                        freshOranges--;
                        if(freshOranges == 0){
                            return time + 1;
                        }
                        grid[newRow][newColumn] = 2;
                        queue.add(new int[]{newRow, newColumn, time + 1});
                    }                   
                }
            }         
        }
        return -1;
    }
}
