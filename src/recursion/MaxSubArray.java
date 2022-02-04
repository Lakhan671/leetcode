package recursion;

public class MaxSubArray {
    public static void main(String[] args) {
        int[]a=new int[]{-1, 10, 20};
        System.out.println(maxSum(a,2,a.length));
    }
    static int maxSum(int[] a,int k,int n){
         int max=0;
         int maxEnd=0;
        for(int i=0;i<n*k;i++){

            maxEnd=maxEnd+a[i%n];
            if(max<maxEnd){
                max=maxEnd;
            }
            if(maxEnd<0){
                maxEnd=0;
            }

        }
        return  max;
    }
}
