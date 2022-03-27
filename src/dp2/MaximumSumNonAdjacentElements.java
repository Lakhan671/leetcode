package dp2;

public class MaximumSumNonAdjacentElements {
    public static void main(String[] args) {
        int[] a=new int[]{5,10,10,100,5,6};
        int incl=a[0];
        int excl=0;
        for (int i=1;i<a.length;i++){
            int nincl=excl+a[i];
            int nexcl=Math.max(incl,excl);
            incl=nincl;
            excl=nexcl;
        }
        System.out.println(Math.max(incl,excl));
    }
}
