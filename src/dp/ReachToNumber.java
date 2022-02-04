package dp;

public class ReachToNumber {
    public static void main(String[] args) {
      reach(4,0,"");
    }

    private static void  reach(int n,int sum,String numbers) {

        if(n==sum){
            System.out.println(numbers);
          return ;
        } if(sum>n){
          return;
        }
         for(int i=1;i<=n;i++){
             if(i==2){
                 continue;
             }
             reach(n,sum+i,i+"  "+numbers);
         }



    }
}
