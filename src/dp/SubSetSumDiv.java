package dp;

import java.util.ArrayList;

public class SubSetSumDiv {
    public static void main(String[] args) {
        int a[] = new int[]{3, 1, 7, 5};
        f(a, 0, new ArrayList<>(), 6);
    }

    static void f(int[] set, int i, ArrayList<Integer> list, int m) {
        int s = 0;
        for (int p : list) {
            s += p;
        }
        if (s != 0 && s % m == 0) {
            System.out.println(list);
            list.clear();
            return;
        }
        if (i == set.length) {
            return;
        }
        f(set, i + 1, list, m);
        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.add(set[i]);
        f(set, i + 1, list2, m);

    }
}
