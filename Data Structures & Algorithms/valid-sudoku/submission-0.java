class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character>rows =new HashSet<>();
            HashSet<Character>cols=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] != '.') {
                    if(rows.contains(board[i][j])) return false;
                    rows.add(board[i][j]);
                }
                if(board[j][i] != '.') {
                    if(cols.contains(board[j][i])) return false;
                    cols.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character>seen=new HashSet<>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                        int row=(i/3)*3+j;
                        int col=(i%3)*3+k;
                        if(board[row][col]=='.') continue;
                        if(seen.contains(board[row][col])){
                            return false;
                        }
                        seen.add(board[row][col]);
                    }
            }
        }
        return true;
    }
}