package dp2;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(10));
        int[] dp=new int[10+1];
        System.out.println( fib(10,dp));;
    }
    static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        System.out.println("Hello "+n);
        return fib(n-1)+fib(n-2);
    }
    static int fib(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        System.out.println("Hello "+n);
       int fi=fib(n-1,dp)+fib(n-2,dp);
        dp[n]=fi;
        return dp[n];
    }
}
