package dp2;

public class CoinChangeCombination {
    public static void main(String[] args) {
        int n=3;
        int coinSum=7;
        int[]a=new int[]{2,3,5};
        int[]dp=new int[coinSum+1];

        dp[0]=1;
        for (int i=0;i<a.length;i++){
            for (int j=a[i];j<dp.length;j++){
                dp[j]+=dp[j-a[i]];
            }
        }
        System.out.println(dp[coinSum]);
    }
}
