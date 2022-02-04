package recursion;

public class Lexicographical {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            printX(i,40);
        }
    }

    private static void printX(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        for (int j=0;j<10;j++){
            printX(10*i+j,n);
        }
    }
}
