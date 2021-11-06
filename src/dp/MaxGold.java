package dp;

public class MaxGold {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{   {3, 2, 12, 15, 10},
                                        {6, 19, 7, 11, 17},
                                        {8, 5, 12, 32, 21},
                                        {3, 20, 2, 9, 7}};
        int maxGold=0;
        for(int j=0;j<matrix[0].length;j++){
           maxGold=Math.max(maxGold,rec(matrix,0,j));
        }
        System.out.println(maxGold);
    }
    public  static  int rec(int[][] matx,int i,int j){
        if(i==matx.length || j<0|| j==matx[0].length){
            return 0;
        }else{
            return  matx[i][j]+Math.max(rec(matx,i+1,j-1),Math.max(rec(matx,i+1,j),rec(matx,i+1,j+1)));
        }
    }
}
