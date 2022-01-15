package dp;

import java.util.ArrayList;

public class SubSetSum {

    public static void main(String[] args) {
        int[] pat = {2, 3, 5, 6, 8, 10};

        f(pat, 0, 10, new ArrayList<Integer>());

        printSubsetSums(pat, 10, 0, "");
    }

    static void f(int[] pat, int i, int currSum, ArrayList<Integer> list) {
        if (currSum == 0) {
            System.out.println(list);
            list = new ArrayList<>();
            return;
        }
        if (i == pat.length) {
            return;
        }
        f(pat, i + 1, currSum, list);
        ArrayList list2 = new ArrayList();
        list2.addAll(list);
        list2.add(pat[i]);
        f(pat, i + 1, currSum - pat[i], list2);

    }

    public static void printSubsetSums(int[] arr, int sum, int i, String acc) {
        if (sum == 0 && !"".equals(acc)) {
            System.out.println(acc);
            acc = "";
        }
        if (i == arr.length) {
            return;
        }
        printSubsetSums(arr, sum, i + 1, acc);
        printSubsetSums(arr, sum - arr[i], i + 1, acc + " " + arr[i]);
    }
}
