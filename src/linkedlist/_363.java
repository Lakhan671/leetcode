package linkedlist;

public class _363 {
    public static int maxSumSubmatrix(int[][] matrix, int k) {

        int[] rr=new int[matrix[0].length];
        System.out.println("row ="+matrix.length+" column="+matrix[0].length);
        for(int c=0;c<matrix[0].length;c++){
            int temp=0;
              for(int r=0;r<matrix.length;r++){
                   temp=temp+matrix[r][c];
              }
              rr[c]=temp;
        }
        int p=0;
        int b=0;
        int out=0;
        for(int j=0;j<rr.length;){

               p+=rr[j];
            //System.out.println("p="+p);




             if(j<rr.length){



                     out++;
                 System.out.println(out);
                 j++;
             }else{
                 p=0;
                 out=0;
                 j=++b;
             }

        }

        return out;
}

    public static void main(String[] args) {
        int[][] matrix = { { 2, 2, -1 },
                 };
        int K = 3;
        System.out.println( maxSumSubmatrix(matrix,K));
    }
}
