package dp;

public class MinDiff {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{-36,36}));
    }
    public static int minimumDifference(int[] nums) {
        if(nums.length-1==1){
            return Math.abs(nums[0]-nums[1]);
        }
        return findMinAbsDiff(nums, nums.length - 1, 0, 0);
    }
    public static int findMinAbsDiff(int[] S, int n, int S1, int S2)
    {

        // Base case: if the list becomes empty, return the absolute
        // difference between both sets
        if (n < 0) {
            return Math.abs(S1 - S2);
        }

        // Case 1. Include the current item in subset `S1` and recur
        // for the remaining items `n-1`
        int inc = findMinAbsDiff(S, n - 1, S1 + S[n], S2);

        // Case 2. Exclude the current item from subset `S1` and recur for
        // the remaining items `n-1`
        int exc = findMinAbsDiff(S, n - 1, S1, S2 + S[n]);

        return Integer.min(inc, exc);
    }
}
