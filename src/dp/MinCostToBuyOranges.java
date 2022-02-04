package dp;

public class MinCostToBuyOranges {
    static int rec_helper(int curWeightSum, int i, int n, int wt[], int val[], int maxWeight, int[][] dp){
        if(i==n){
            return 0;
        }
        if(dp[i][curWeightSum]!=-1){
            return dp[i][curWeightSum];
        }
        dp[i][curWeightSum] = rec_helper(curWeightSum,i+1,n,wt,val,maxWeight,dp);
        if(curWeightSum+wt[i]<=maxWeight) {
            dp[i][curWeightSum] = Math.max(dp[i][curWeightSum],
                    val[i] + rec_helper(curWeightSum + wt[i], i, n, wt, val, maxWeight, dp));
        }
        return dp[i][curWeightSum];
    }
    static int  unbounded_knapsack(int n,int wt[],int val[],int maxWeight){
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i]=new int[maxWeight+1];
            for(int j=0;j<maxWeight+1;j++){
                dp[i][j]=-1;
            }
        }
        return rec_helper(0,0,n,wt,val,maxWeight,dp);
    }


    static int  minCost(int[] w,int[] v,int W,int myweight,int index,int cost) {
        if (myweight == W) {
           // System.out.println(cost);
            return cost;
        }
        if (myweight > W) {
            return 100000;
        } else {
            int w1 = w[index] + minCost(w, v, W, w[index] + myweight, index, cost + v[index]);
            int w2 = minCost(w, v, W, w[index + 1] + myweight, index + 1, cost + v[index + 1]);
            return  Math.min(w1, w2);

        }
    }
    // Driver code
    public static void main(String args[]) {
        int  wt[]= new int[]{1, 2, 3,4,5};
         int val[] = new int[]{20, 10, 4, 50, 100};
         int W = 5;
         int n = val.length;
        System.out.println(unbounded_knapsack(n, wt, val, W));
        System.out.println(minCost(wt,val,W,0,0,0));

    }
}
