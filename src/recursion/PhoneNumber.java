package recursion;

import java.util.ArrayList;

public class PhoneNumber {
    static String[] codes = new String[]{";", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {

        ArrayList<String> listWord = getKPS("678");
        System.out.println(listWord);
        System.out.println("-------------------");
        printKPS("678","");
    }

    private static ArrayList<String> getKPS(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return  baseCase;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> res = getKPS(ros);
        ArrayList<String> myResult = new ArrayList<>();
        String codeForCh = codes[ch-'0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (String resc : res) {
                myResult.add(chCode + resc);
            }
        }
        return myResult;
    }
    private static void printKPS(String str,String ans) {
        if (str.length() == 0) {
            System.out.print(ans +", ");
            return ;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        String codeForCh = codes[ch-'0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
           printKPS(ros,ans+chCode);
        }

    }
}
