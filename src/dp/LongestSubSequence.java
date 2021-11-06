package dp;

public class LongestSubSequence {
    public static void main(String[] args) {
        String s1="abdacbab";
        String s2="acebfca";
        System.out.println(lcs(s1,s2,0,0));;
    }
    public static String lcs(String s1,String s2,int i,int j){
        if(i==s1.length()||j==s2.length()){
            return "";
        }else if(s1.charAt(i)==s2.charAt(j)){
            return s1.charAt(i)+","+lcs(s1,s2,i+1,j+1);
        }else{
            String a=lcs(s1,s2,i+1,j);
            String b=lcs(s1,s2,i,j+1);
            return a.length()>b.length()?a:b;
        }

    }
}
