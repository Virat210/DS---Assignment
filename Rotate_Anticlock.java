
import java.util.*;

class Solution {
    public void rotateMatrixCounterClockwise(int[][] mat) {
        int n = mat.length;
      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each column
        for (int j = 0; j < n; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = mat[top][j];
                mat[top][j] = mat[bottom][j];
                mat[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        sol.printMatrix(mat);

        sol.rotateMatrixCounterClockwise(mat);

        System.out.println("\nRotated Matrix (90° Counterclockwise):");
        sol.printMatrix(mat);
    }
}
