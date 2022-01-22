package dp;

public class MaxWeight {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{ 4, 2 ,3 ,4 ,1 },
                { 2 , 9 ,1 ,10 ,5 },
                {15, 1 ,3 , 0 ,20 },
                {16 ,92, 41, 44 ,1},
                {8, 142, 6, 4, 8} };
        System.out.println(rec(mat,0,0));
    }
    static int rec(int[][] mat,int i,int j){
        if(i>mat.length-1 || j<0 || j>mat[0].length-1){
         return 0;
        }else{
          return  mat[i][j]+Math.max(rec(mat,i+1,j+1),rec(mat,i+1,j));
        }
    }
}
