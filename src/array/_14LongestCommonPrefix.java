package array;

public class _14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].trim().length()==0) {
            return "";
        }
        if(strs.length == 1 ){
            return strs[0];
        }
        String prefix ="";
           int j=1,k=0;
           char c=strs[0].charAt(0);
            while (j<strs[0].length()-1) {
                if(strs[j].charAt(k)==c){
                    j++;
                }else k++;
                if(j==strs.length ){
                    j=0;k++;
                    prefix+=c;
                    c=strs[j].charAt(k);
                }
                if(strs[0].charAt(strs[0].length()-1)==strs[0].charAt(k)) return prefix;

        }
        return prefix;


    }

    public static void main(String[] args) {
        String[] str=new String[]{"ab","a"};
        System.out.println(longestCommonPrefix(str));
    }
}
