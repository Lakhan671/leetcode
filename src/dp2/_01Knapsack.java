package dp2;

public class _01Knapsack {
    public static void main(String[] args) {
        int n=5;
        int[]w=new int[]{2,5,1,3,4};
        int [] v=new int[]{15,14,10,45,30};
        int size=7;
        int[][]dp=new int[n+1][size+1];
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){

                if (j>=w[i-1]){
                    int remcap=j-w[i-1];
                    if (dp[i-1][remcap]+v[i-1]>dp[i-1][j]){
                        dp[i][j]=dp[i-1][remcap]+v[i-1];
                    }else {
                        dp[i][j]=dp[i-1][j];
                    }
                }else {
                    dp[i][j]=dp[i-1][j];

                }
            }
        }
        System.out.println(dp[n][size]);
    }
}
