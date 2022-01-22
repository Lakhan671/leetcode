package recursion;

public class PrintIncreasingAndDecreasing {
    public static void main(String[] args) {
       rec(5);
        System.out.println("-------------fact--------------");
        System.out.println(fact(5));
        System.out.println("-----power----");
        power(5,3,1);
        System.out.println(power2(5,3));
        System.out.println(power3(5,3));
    }

    private static void  rec(int i) {
        if(i==0){
            return ;
        }
        System.out.println(i);
        rec(i-1);
        System.out.println(i);

    }
    static  int fact(int i){
        if(i==0){
            return 1;
        }
        return  i*fact(i-1);
    }
    static void power(int n,int power,int result){
        if(power==0){
            System.out.println(result);
            return;
        }
        result=result*n;
        power(n,power-1,result);
    }
    static int  power2(int n,int power){
        if(power==0){
           return 1;
        }
        return n* power2(n,power-1);
    }
    //time com-logn
    static int power3(int x,int n){
        if(n==0){
            return 1;
        }
          int xn=power3(x,n/2);
          //x^n= x^n/2 * X^n/2; if even
        //x^n= x^n/2 * X^n/2 *X; if odd
        int xnn=xn*xn;
        if(n%2==1){
            xnn=xnn*x;
        }
        return  xnn;
    }
}
