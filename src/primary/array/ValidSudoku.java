package primary.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    //下标处理方式
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
            Set<Character> setRow = new HashSet<>();
            Set<Character> setCol = new HashSet<>();
            Set<Character> setBox = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(setRow.contains(board[i][j])) return false;
                    if(setCol.contains(board[j][i])) return false;
                    setRow.add(board[i][j]);
                    setCol.add(board[j][i]);
                }
                int row = 3 * (i / 3) + j / 3;
                int col = 3 * (i % 3) + j % 3;
                if(board[row][col] != '.') {
                    if(setBox.contains(board[row][col])) return false;
                    setBox.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
