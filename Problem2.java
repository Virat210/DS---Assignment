
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int bestTeam = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++){
              sum += sc.nextInt();
            }
            if(sum > maxSum){
              maxSum = sum; 
              bestTeam = i; }
        }

        System.out.println(bestTeam);
        sc.close();
    }
}
