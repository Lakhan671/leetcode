package dp;

public class FindFriend {
    static int[] dp = new int[1000];

    // Returns count of ways n people
    // can remain single or paired up.
    static int countFriendsPairings(int n)
    {
        if(n<0){
            return 0;
        }
        if (n<2)
           return 1;



         return countFriendsPairings(n - 1) + (n - 1) * countFriendsPairings(n - 2);

    }

    // Driver code
    public static void main(String[] args)
    {
        for (int i = 0; i < 1000; i++)
            dp[i] = -1;
        int n = 4;
        System.out.println(countFriendsPairings(n));
    }
}
