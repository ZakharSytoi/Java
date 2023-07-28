package org.example;

public class Solution {
    // At first, I've tried to iterate by diagonals, that was complicated and
    // worked only for square matrix, then I understood that i can iterate in simple way
    // because in that way we have upper and left elements already calculated, so we can
    // proceed to the next one.
    public int minPathSum(int[][] grid) {
        for (int i = 1; i < grid[0].length; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for(int i = 1; i < grid.length; i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i < grid.length; i++){
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}

