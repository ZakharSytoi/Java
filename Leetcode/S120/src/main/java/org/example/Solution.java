package org.example;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 1) return triangle.get(0).get(0);
        int[][] optimalTriangle = new int[triangle.size()][];
        optimalTriangle[triangle.size()-1] = new int[triangle.get(triangle.size()-1).size()];
        for (int j = 0; j < optimalTriangle[optimalTriangle.length-1].length; j++){
            optimalTriangle[optimalTriangle.length-1][j] = triangle.get(triangle.size()-1).get(j);
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            optimalTriangle[i] = new int[triangle.get(i).size()];
            for (int j = 0; j < optimalTriangle[i].length; j++){
                optimalTriangle[i][j] = triangle.get(i).get(j) + Math.min(optimalTriangle[i+1][j],optimalTriangle[i+1][j+1]);
            }
        }
        return optimalTriangle[0][0];
    }
}


//not optimal...
/*public class Solution {
    int min = Integer.MAX_VALUE;
    List<List<Integer>> triangle;

    public int minimumTotal(List<List<Integer>> triangle) {
        this.triangle = triangle;
        if(triangle.size() == 1) return triangle.get(0).get(0);
        checkLayer(triangle.get(0).get(0), 1, 0);
        return min;
    }

    public void checkLayer(int currentSum, int layerNumber, int parentIndex) {
        if(triangle.size() - 1 == layerNumber){
            min = Math.min(min, currentSum+triangle.get(layerNumber).get(parentIndex));
            if (triangle.get(layerNumber).size() > parentIndex + 1){
                min = Math.min(min, currentSum+triangle.get(layerNumber).get(parentIndex+1));
            }
            return;
        }
        checkLayer(currentSum + triangle.get(layerNumber).get(parentIndex), layerNumber + 1, parentIndex);
        if (triangle.get(layerNumber).size() > parentIndex + 1) {
            checkLayer(currentSum + triangle.get(layerNumber).get(parentIndex+1), layerNumber + 1, parentIndex + 1);
        }
    }
}*/
