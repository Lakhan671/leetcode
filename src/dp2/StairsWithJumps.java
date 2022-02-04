package dp2;

public class StairsWithJumps {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{5,9,8,6,3,8,9,1},8));
    }
    static  int jump(int [] arr,int n){
        int[]dp=new int[n+1];
        dp[n]=1;
        for (int i=n-1;i>=0;i--){
            for (int j=1;i<=arr[i]&&i+j<dp.length;j++){
              dp[i]+=dp[i+j];
            }
        }
       return dp[0];
    }
}
