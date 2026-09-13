
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] matrix = new int[N][M];
      
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                matrix[i][j] = scn.nextInt();

        // Reverse each row
        for (int i = 0; i < N; i++) {
            int left = 0, right = M - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
      
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
