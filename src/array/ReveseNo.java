package array;

public class ReveseNo {
    public static void main(String[] args) {

        int n=123;
        int n1=n;
        int newNo=0;
      for(int a:new int[]{1,2}){
          while(n>0){
              newNo=(newNo*10)+n%10;
              n=n/10;
          }
          n=newNo;
          newNo=0;
      }

        System.out.println(n==n1);
    }
}
