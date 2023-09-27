package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] == ' ') {
                    result = false;
                    break;
                }
            }
        return result;
        }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int el = 0; el < board.length; el++) {
            if (board[el][el] == 'X') {
                boolean vertical = monoVertical(board, el);
                boolean horizontal = monoHorizontal(board, el);
                if (vertical && horizontal == true) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
