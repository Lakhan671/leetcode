package array;

import java.util.Arrays;
import java.util.HashSet;

public class CheckPangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog".replace(" ","");
        checkPangram(str);
    }

    private static void checkPangram(String str) {
        str=str.toLowerCase();
        HashSet<Character>charSet=new HashSet<>();

       for(char c:str.toCharArray()){
           if(c>='a' && c<='z'){
               charSet.add(c);
           }

       }
        System.out.println(charSet.size()==26?"it's a Pangram":"not Pangram");
    }
}
