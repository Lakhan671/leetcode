package dp;

import java.util.HashMap;
import java.util.Map;

public class NoOfPaths {
    public static void main(String[] args) {
        Map<Integer,Integer> memo=new HashMap<>();
        int[][] matrix = new int[][]{{0, 0, 1, 0, 1},
                                     {0, 0, 0, 0, 1},
                                     {0, 0, 1, 0, 0},
                                     {1, 0, 0, 0, 0}};
        System.out.println(noOfPaths(0,0,matrix));
    }

    public static int noOfPaths(int i, int j, int[][] matrix) {
        if (i == matrix.length  || j == matrix[0].length  || matrix[i][j]==1) {
            return 0;
        }else if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            return 1;
        } else {
            return noOfPaths(i+1,j,matrix)+noOfPaths(i,j+1,matrix);

        }

    }
}
