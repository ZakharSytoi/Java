package org.example;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        Integer[] result = new Integer[size];
        int resultIndex = 0;
        int leftBorder = 0;
        int rightBorder = matrix[0].length - 1;
        int upperBorder = 0;
        int lowerBorder = matrix.length - 1;

        while (true) {
            for (int goRight = leftBorder; goRight <= rightBorder; goRight++) {
                result[resultIndex] = matrix[upperBorder][goRight];
                resultIndex++;
            }
            if (resultIndex == size) break;
            upperBorder++;
            for (int goDown = upperBorder; goDown <= lowerBorder; goDown++) {
                result[resultIndex] = matrix[goDown][rightBorder];
                resultIndex++;
            }
            if (resultIndex == size) break;
            rightBorder--;
            for (int goLeft = rightBorder; goLeft >= leftBorder; goLeft--) {
                result[resultIndex] = matrix[lowerBorder][goLeft];
                resultIndex++;
            }
            if (resultIndex == size) break;
            lowerBorder--;
            for (int goUp = lowerBorder; goUp >= upperBorder; goUp--) {
                result[resultIndex] = matrix[goUp][leftBorder];
                resultIndex++;
            }
            if (resultIndex == size) break;
            leftBorder++;
        }
        return Arrays.asList(result);
    }

}


