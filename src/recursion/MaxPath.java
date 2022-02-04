package recursion;

public class MaxPath {
    public static void main(String[] args) {
        int[][] mat=new int[][]{ {4, 2, 3, 4},
                                  {2, 9, 1, 10},
                                  {15, 1, 3, 0},
                                  {16, 92, 41, 44} };
        System.out.println(maxSum(mat,0,0,0));
        int cost[][] = { {1, 2, 3},
                         {4, 8, 2},
                         {1, 5, 3} };
        System.out.println( minSum(cost,2,2));

    }
     static int maxSum(int[][] a,int row,int column,int sum){


         if(row>a.length-1 || column>a[0].length-1 || column<0){
             return  0;
         }
         if(row==a.length-1  && column==a[0].length-1){
           //  System.out.println(sum);
             return  sum;
         }
         int s1=maxSum(a,row+1,column,sum+a[row][column]);
         int s2=maxSum(a,row+1,column-1,sum+a[row][column]);
         int s3=maxSum(a,row+1,column+1,sum+a[row][column]);
         return  Math.max((Math.max(s3,s2)),s1)+a[row][column];
     }

    static int minSum(int[][] a,int row,int column){
        if( column<0 || row<0){
            return  Integer.MAX_VALUE;
        }
        if(row==0  && column==0){
            return  a[0][0];
        }
        int s1=minSum(a,row-1,column-1);
        int s2=minSum(a,row-1,column);
        int s3=minSum(a,row,column-1);
        return a[row][column]+  Math.min((Math.min(s3,s2)),s1);
    }
}
