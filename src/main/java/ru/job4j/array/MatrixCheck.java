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
    }
