
import java.util.*;

class Solution {

    public static void waveTraversal(int[][] matrix, int N, int M) {
        for (int j = 0; j < M; j++) {
            if (j % 2 == 0) {
                // Even-indexed column: top to bottom
                for (int i = 0; i < N; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Odd-indexed column: bottom to top
                for (int i = N - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
