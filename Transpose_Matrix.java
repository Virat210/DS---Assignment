
import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < col; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < row; j++) {
                temp.add(mat[j][i]);  // Transpose element
            }
            result.add(temp);
        }

        return result;
    }
}
