package dp;

import java.util.HashMap;
import java.util.Map;

public class FindSortestPathSum {
    public static void main(String[] args) {
        Map<Integer,Integer>memo=new HashMap<>();
        int[][] matrix = new int[][]{{3, 2, 12, 25, 10}, {6, 19, 7, 11, 17}, {8, 5, 12, 32, 21}, {3, 20, 2, 9, 7}};
        System.out.println(sortPath(0,0,matrix));
    }

    public static int sortPath(int i, int j, int[][] arr) {
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }else if (i == arr.length - 1) {
            return arr[i][j]+sortPath(i, j+1, arr);
        } else if (j == arr[0].length - 1) {
            return arr[i][j]+sortPath(i+1, j, arr);
        } else {
            return arr[i][j] + Math.min(sortPath(i + 1, j, arr), sortPath(i, j + 1, arr));
        }

    }
}