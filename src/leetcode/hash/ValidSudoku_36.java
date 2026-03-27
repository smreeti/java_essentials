package leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;

/*
* Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
*
* Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true

Example 2:
Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
* */
public class ValidSudoku_36 {

    //Time: O(n2), Space: 0(3n)/On(n)
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("valid sudoku::" + isValid(board));
    }

    private static boolean isValid(char[][] board) {
        int n = 9;

        //use hashset to record the status
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] columns = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for (int r = 0; r < n; r++) {
            rows[r] = new HashSet<>();
            columns[r] = new HashSet<>();
            boxes[r] = new HashSet<>();
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                char value = board[r][c];

                if (value == '.') {
                    continue;
                }

                //check rows
                if (rows[r].contains(value)) {
                    return false;
                }

                rows[r].add(value);

                //check columns
                if (columns[c].contains(value)) {
                    return false;
                }

                columns[c].add(value);

                //check boxes
                int index = (r / 3) * 3 + c / 3;
                if (boxes[index].contains(value)) {
                    return false;
                }

                boxes[index].add(value);
            }
        }

        return true;
    }
}
