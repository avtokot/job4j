package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int countRow = 0;
        int countCol = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][row] == 'X') {
                    countRow++;
                    result = true;
                } else if (board[col][col] == 'X') {
                    countCol++;
                    result = true;
                }
            }
        }
        if (countCol == 5 || countRow == 5) {
            result = true;
        }
        return result;
    }
}
