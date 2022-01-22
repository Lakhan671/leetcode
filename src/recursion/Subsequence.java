package recursion;

import java.util.ArrayList;

public class Subsequence  {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(getSubsequence(str));
        printSubSequence("abc","");
    }
    static ArrayList<String>getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> baseCase=new ArrayList<>();
            baseCase.add("");
            return  baseCase;
        }
        char c=str.charAt(0);
        String sub=str.substring(1);
        ArrayList<String>list=getSubsequence(sub);
        ArrayList<String>myResult=new ArrayList<>();
        list.forEach(a->{
            myResult.add(a);

        });
        list.forEach(a->{
            myResult.add(c+a);
        });
        return myResult;
    }
     static void printSubSequence(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        printSubSequence(roq,ans+"");
        printSubSequence(roq,ans+ch);
     }
}
