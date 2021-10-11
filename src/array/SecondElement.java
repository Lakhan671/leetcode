package array;

public class SecondElement {
    public static int secondSmall(int[] a){
         int i=0,j=0;
         int index=0;
         int e=Integer.MAX_VALUE;
         int n= Integer.MAX_VALUE;
         while(j<2){
             if(j>0 && a[i]>n){
                 e=Math.min(e,a[i]);
             }else{
                if(i<a.length-1 &&a[i]<n ){
                    n=Math.min(a[i],n);
                    index=i;
                }
             }
             if(i==a.length-1){
                 i=-1;
                 a[index]=Integer.MAX_VALUE;
                 j++;
             }
             i++;
         }
         return e;
    }

    public static void main(String[] args) {
        int [] a=new int[]{4,8, 9, 2, 7, 67};
        System.out.println(secondSmall(a));
    }
}
