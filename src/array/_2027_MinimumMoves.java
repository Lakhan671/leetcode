package array;

public class _2027_MinimumMoves {
    public int minimumMoves(String s) {
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'O') {
                i++;
                continue;
            }
            i += 3;
            m++;
        }
        return m;
    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][] = null;
        if (m * n != original.length) {
            arr = new int[0][0];
        } else {
            arr = new int[m][n];
            int index = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = original[index];
                    index++;
                }
            }

        }

        return arr;
    }




    public static void main(String[] args) {

    }
}
