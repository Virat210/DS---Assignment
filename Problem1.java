
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char pattern = sc.next().charAt(0);   // Pattern type: Z, D, A, X
        int N = sc.nextInt();                 // Matrix size

        int[][] matrix = new int[N][N];
        int number = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = number++;
            }
        }

        int[][] result = new int[N][N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean flag = false;

                if (pattern == 'Z') {
                    // Top row, bottom row, or diagonal from top-right to bottom-left
                    if (i == 0 || i == N - 1 || j == N - 1 - i) flag = true;
                }
                else if (pattern == 'D') {
                    // Boundary elements
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) flag = true;
                }
                else if (pattern == 'A') {
                    // Top row, bottom row, or diagonal from top-left to bottom-right
                    if (i == 0 || i == N - 1 || i == j) flag = true;
                }
                else if (pattern == 'X') {
                    // Both diagonals
                    if (i == j || j == N - 1 - i) flag = true;
                }

                // If this cell is part of the pattern, copy it to result and add to sum
                if (flag) {
                    result[i][j] = matrix[i][j];
                    sum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);

        sc.close();
    }
}
