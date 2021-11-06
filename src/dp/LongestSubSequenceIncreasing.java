package dp;

public class LongestSubSequenceIncreasing {
    public static void main(String[] args) {
int a[]=new int[]{7, 5, 2, 4, 7, 2, 3, 6, 4, 5, 12, 1, 7};
        System.out.println(lis(a,0,Integer.MIN_VALUE));
    }

    public static int lis(int[] arr, int i, int prev) {
        if (i == arr.length) {
            return 0;
        } else if (arr[i] <= prev)
            return lis(arr, i + 1, prev);
        else {
            return Math.max(1 + lis(arr, i + 1, arr[i]), lis(arr, i + 1, prev));
        }
    }
}