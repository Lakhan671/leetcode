package recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(a,0);
    }
    static void reverse(int[]a,int i){
        if(i==a.length){
            return;
        }
        reverse(a,i+1);
        System.out.println(a[i]);
    }
}
