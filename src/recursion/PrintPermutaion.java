package recursion;

public class PrintPermutaion {
    public static void main(String[] args) {
        printPermutaion("abc","");
    }

    private static void printPermutaion(String qu,String ans) {
        if(qu.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<qu.length();i++){
        char ch=qu.charAt(i);
        String left=qu.substring(0,i);
        String right=qu.substring(i+1);
        printPermutaion(left+right,ans+ch);
        }
    }
}
