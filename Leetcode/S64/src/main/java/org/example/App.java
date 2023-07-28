package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*int[][] arr = new int[][]{
                {1, 3, 1, 2, 4},
                {1, 5, 1, 6, 3},
                {3, 1, 7, 4, 2},
                {1, 5, 8, 3, 10},
                {2, 7, 3, 9, 4}
        };*/
        /*int[][] arr = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };*/
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        Solution solution = new Solution();
        solution.minPathSum(arr);
    }
}
