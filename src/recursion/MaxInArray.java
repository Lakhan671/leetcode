package recursion;

public class MaxInArray {
    public static void main(String[] args) {
        int[] a = new int[]{11, 2, 3, 4, 50, 6, 7, 80, 9, 10};
        max(a, Integer.MIN_VALUE, 0);
        System.out.println(max2(a,0));
    }

    static void max(int[] a, int m, int i) {
        if (a.length == i) {
            System.out.println(m);
            return;
        }
        m = Math.max(a[i], m);
        max(a, m, i + 1);
    }

    static int max2(int[] a, int i) {
        if(i==a.length-1){
            return a[i];
        }
        int misa = max2(a, i + 1);
        if (misa > a[i]) {
            return misa;
        } else {
            return a[i];
        }
    }
}
