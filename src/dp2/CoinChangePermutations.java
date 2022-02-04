package dp2;

public class CoinChangePermutations {
    public static void main(String[] args) {
        int[]coins=new int[]{2,3,5,6};
        int nOfCoins=4;
        int target=10;
        int[]dp=new int[target+1];
        dp[0]=1;
        for (int amount=1;amount<dp.length;amount++){
            for (int coin:coins){
              if (coin<=amount){
                  int rem=amount-coin;
                  dp[amount]+=dp[rem];
              }
            }
        }
        System.out.println(dp[target]);
    }
}
