package org.example;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> currentCheckedSet = new HashSet<>();
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar != '.') {
                    if (!currentCheckedSet.contains(aChar)) currentCheckedSet.add(aChar);
                    else return false;
                }
            }
            currentCheckedSet.clear();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (!currentCheckedSet.contains(board[j][i]))
                        currentCheckedSet.add(board[j][i]);
                    else return false;
                }

            }
            currentCheckedSet.clear();
        }
        for (int initY = 0; initY < board.length; initY += 3) {
            for (int initX = 0; initX < board.length; initX += 3) {
                for (int i = initY; i < initY + 3; i++) {
                    for (int j = initX; j < initX + 3; j++) {
                        if (board[j][i] != '.') {
                            if (!currentCheckedSet.contains(board[j][i]))
                                currentCheckedSet.add(board[j][i]);
                            else return false;
                        }
                    }
                }
                currentCheckedSet.clear();
            }
        }
        return true;
    }
    // It's possible to use set to store different values by modifying
    // them in different ways. that mean we can create several groups with different
    // modification method.
}
