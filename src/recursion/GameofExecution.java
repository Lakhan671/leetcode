package recursion;

public class GameofExecution {
    public static void main(String[] args) {
        System.out.println( kill(5,3));
    }

    private static int kill(int n, int k) {
        if(n==1){
            return 0;
        }
       int x= kill(n-1,k);
       int y=(x+k)%n;
       return y;
    }
}
