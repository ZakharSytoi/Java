import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        int numberOfDucks = 20;
        int maxWidth = 50;

        int[] heightsArray = new int[]{3, 5, 7, 2, 8, 4, 6, 9, 1, 5, 7, 8, 3, 4, 6, 2, 1, 5, 8, 9,};
        int[] widthsArray = new int[]{2, 4, 6, 1, 5, 3, 7, 9, 2, 4, 6, 8, 3, 5, 7, 1, 2, 4, 6, 8,};
        int[][] A = new int[numberOfDucks + 1][];

        A = new int[numberOfDucks + 1][];
        for (int i = 0; i < numberOfDucks + 1; i++) {
            A[i] = new int[maxWidth + 1];
        }

        for (int k = 0; k <= numberOfDucks; k++) {
            for (int s = 0; s <= maxWidth; s++) {
                if (k == 0 || s == 0) {
                    A[k][s] = 0;
                } else {
                    if (s >= widthsArray[k - 1]) {
                        A[k][s] = Math.max(A[k - 1][s], A[k - 1][s - widthsArray[k - 1]] + heightsArray[k - 1]);
                    } else {
                        A[k][s] = A[k - 1][s];
                    }
                }
            }
        }

        System.out.println(A[numberOfDucks][maxWidth]);

       /* ArrayList<Integer> result = new ArrayList<>();
        traceResult(A, widthsArray, numberOfDucks, maxWidth, result);
        for(Integer integer : result) {
            System.out.println(integer);
        }*/

    }
    private static void traceResult(int[][] A, int[] weight, int k, int s, ArrayList<Integer> result) {
        if (A[k][s] == 0) {
            return;
        }
        if (A[k -1][s] == A[k][s]) {
            traceResult(A, weight, k - 1, s, result);
        } else {
            traceResult(A, weight, k - 1, s - weight[k - 1], result);
            result.add(0, k);
        }
    }
}