class Solution {
    public  boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char number = board[i][j];

                if(number == '.'){
                    continue;
                }

                int currBox = (i / 3 * 3) + (j / 3);
                if(row.contains(number) || columns[j].contains(number) || boxes[currBox].contains(number)){
                    return false;
                }

                row.add(number);
                columns[j].add(number);
                boxes[currBox].add(number);
            }
            row.clear();
        }
        return true;
    }
}
