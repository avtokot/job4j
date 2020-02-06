package ru.job4j.array;

public class MatrixCheck {
//    public static boolean isWin(char[][] board) {
//        boolean result = false;
//        int countRow = 0;
//        int countCol = 0;
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board.length; col++) {
//                if ((board[row][row] == 'X') || (board[col][col] == 'X')) {
//                    countRow++;
//                    countCol++;
//                    result = true;
//                }
//                if (countCol == board.length || countRow == board.length) {
//                    result = true;
//                    break;
//                }
//            }
//        }
//        return result;
//    }


    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] diagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}

