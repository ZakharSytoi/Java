package org.example;


public class Solution {
    public void gameOfLife(int[][] board) {
        int[][] nextState = new int[board.length][board[0].length];
        int sumForCell = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i - 1 >= 0 && j - 1 >= 0) {
                    if (board[i - 1][j - 1] == 1) sumForCell++;
                }
                if (j - 1 >= 0) {
                    if (board[i][j - 1] == 1) sumForCell++;
                }
                if (i + 1 < board.length && j - 1 >= 0) {
                    if (board[i + 1][j - 1] == 1) sumForCell++;
                }
                if (i + 1 < board.length) {
                    if (board[i + 1][j] == 1) sumForCell++;
                }
                if (i + 1 < board.length && j + 1 < board[0].length) {
                    if (board[i + 1][j + 1] == 1) sumForCell++;
                }
                if (j + 1 < board[0].length) {
                    if (board[i][j + 1] == 1) sumForCell++;
                }
                if (i - 1 >= 0 && j + 1 < board[0].length) {
                    if (board[i - 1][j + 1] == 1) sumForCell++;
                }
                if (i - 1 >= 0) {
                    if (board[i - 1][j] == 1) sumForCell++;
                }
                if (board[i][j] == 1) {
                    if (sumForCell < 2) nextState[i][j] = 0;
                    else if (sumForCell < 4) nextState[i][j] = 1;
                    else nextState[i][j] = 0;
                } else if (sumForCell == 3) nextState[i][j] = 1;
                sumForCell = 0;
            }
        }

        for (int i = 0; i < board.length; i++) {
            System.arraycopy(nextState[i], 0, board[i], 0, board[0].length);
        }
    }
}
