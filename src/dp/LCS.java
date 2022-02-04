package dp;

public class LCS {
    public static void main(String[] args) {
        int n, m;
        String  X = "abcdxyz";
        String  Y = "xyzabcd";

        n = X.length();
        m = Y.length();

        System.out.println(lcs(X,Y,n, m,0));
        X="OldSite:GeeksforGeeks.org";
         Y="NewSite:GeeksQuiz.com";
        n = X.length();
        m = Y.length();
        System.out.println(lcs(X,Y,n, m,0));
    }


        static int lcs(String X,String Y,int i, int j, int count)
        {

            if (i == 0 || j == 0)
            {
                return count;
            }

            if (X.charAt(i - 1)
                    == Y.charAt(j - 1))
            {
                count = lcs(X,Y,i - 1, j - 1, count + 1);
            }
            count = Math.max(count,
                    Math.max(lcs(X,Y,i, j - 1, 0),
                            lcs(X,Y,i - 1, j, 0)));
            return count;
        }


}
