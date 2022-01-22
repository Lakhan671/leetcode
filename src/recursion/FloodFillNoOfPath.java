package recursion;

public class FloodFillNoOfPath {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{0, 1, 0, 0, 0, 0, 0},
                                  {0, 1, 0, 1, 1, 1, 0},
                                  {0, 0, 0, 0, 0, 0, 0},
                                  {1, 0, 1, 1, 0, 1, 1},
                                  {1, 0, 1, 1, 0, 1, 1},
                                  {1, 0, 0, 0, 0, 0, 0}
        };
        boolean[][] v = new boolean[mat.length][mat[0].length];
        getPahs(mat, 0, 0, "", v);
    }

    private static void getPahs(int[][] mat, int row, int column, String ans, boolean[][] visited) {
        if (row < 0 || column < 0 || row == mat.length || column == mat[0].length || mat[row][column] == 1 ||
                visited[row][column]) {
            return;
        }
        if (row == mat.length - 1 && column == mat[0].length - 1) {
            System.out.println(ans);
            return;
        } else {
            visited[row][column] = true;
            getPahs(mat, row - 1, column, ans + "t", visited);
            getPahs(mat, row, column - 1, ans + "l", visited);
            getPahs(mat, row + 1, column, ans + "d", visited);
            getPahs(mat, row, column + 1, ans + "r", visited);
            visited[row][column] = false;
        }
    }
}
