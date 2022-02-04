package dp2;

public class ClimbingStair {
    public static void main(String[] args) {
        findPath(4);
        System.out.println( minimumSteps());;
    }

    public static void findPath(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            }
            if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            if (i > 2)
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

        }
        System.out.println(dp[n]);
    }
    static  int minimumSteps(){
        int[] ar=new int[]{1,1,1,4,9,8,1,1,10,1};
        Integer[] dp=new Integer[ar.length+1];
        dp[10]=0;
        for (int i=9  ;i>=0;i--){

            if(ar[i]>0) {


                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= ar[i]&& i+j<dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i]=min+1;
                }

            }

        }
        return  dp[0];
    }
}
