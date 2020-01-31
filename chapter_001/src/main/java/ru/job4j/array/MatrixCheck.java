package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int countRow = 0;
        int countCol = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if ((board[row][row] == 'X') || (board[col][col] == 'X')) {
                    countRow++;
                    countCol++;
                    result = true;
                }
            }
        }
        if (countCol == board.length || countRow == board.length) {
            result = true;
        }
        return result;
    }
}
