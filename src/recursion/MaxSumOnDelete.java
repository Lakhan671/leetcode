package recursion;

import java.util.Arrays;

public class MaxSumOnDelete {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 2, 3, 4};
        System.out.println(max(a, 0, 0));
    }

    private static int max(int[] a, int index, int sum) {
        if (index == a.length - 1) {
            return sum;
        }
        int[] aa = reset(Arrays.copyOf(a, a.length - 1), index);
        int a1 = max(aa, index, sum + a[index]);
        int[] aaa = reset(Arrays.copyOf(a, a.length), index);
        int a2 = max(aaa, index + 1, sum + a[index + 1]);

        return Math.max(a1, a2);
    }

    public static int[] reset(int[] a, int index) {
        int k = -1;
        a[index] = Integer.MIN_VALUE;
        for (int i = index; i < a.length; i++) {

            if (a[index] + 1 == a[i]) {
                break;
            }
            k++;
        }
        if (k != -1) {
            a[k] = Integer.MIN_VALUE;
        }

        k = -1;
        for (int i = index; i < a.length; i++) {

            if (a[index] + 1 == a[i]) {
                break;
            }
            k++;
        }

        if (k != -1) {
            a[k] = Integer.MIN_VALUE;
        }
        return a;

    }
}
