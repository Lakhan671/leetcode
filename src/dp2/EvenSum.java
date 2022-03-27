package dp2;

public class EvenSum {
    public static void main(String[] args) {
        int a[]=new int[]{4, 2, 6, 7, 8};
         int k=3;
        System.out.println( maxEvenSumOfK(a,k,0,0,0));;
         a=new int[]{5, 5, 1, 1, 3};

        System.out.println( maxEvenSumOfK(a,k,0,0,0));

    }

    private static int maxEvenSumOfK(int[] a,int k,int i,int c,int sum) {
        if(c==k){
            return (sum%2==0?sum:-1);
        }
        if (i==a.length){
            return -1;
        }

        return Math.max(maxEvenSumOfK(a,k,i+1,c,sum),
        maxEvenSumOfK(a,k,i+1,c+1,a[i]+sum));

    }
}
