package array;

import java.util.Arrays;

public class CoinsCount {
    Integer[][] dp;
    public int change(int amount, int[] coins) {
        dp=new Integer[amount+1][coins.length+1];
        return dfs(amount,coins,0);
    }
    public int dfs(int amount,int[] coins,int p){
        if(amount<0 || p==coins.length) return 0;
        if(amount==0) return 1;
        if(dp[amount][p]!=null) return dp[amount][p];
        return dp[amount][p]=dfs(amount,coins,p+1) + dfs(amount-coins[p],coins,p);
    }

    public static void main(String[] args) {
       int  amount = 5;
       int[]coins = new int[]{1,2,3,5};
        System.out.println(new CoinsCount().change(amount,coins));
    }
}

