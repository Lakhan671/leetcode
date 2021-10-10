package linkedlist;

public class SubStringDemo {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }

        String maxStr = "";
        String tempStr = "";
        for(int i=0; i < s.length(); i++){
            // 1. if tempStr contains new character, then change tempStr
            if(tempStr.contains("" + s.charAt(i))){
                tempStr = tempStr.substring(tempStr.lastIndexOf(s.charAt(i)) + 1);
            }
            // 2. add new character
            tempStr = tempStr + s.charAt(i);
            // 3. replace maxStr with tempStr if tempStr is longer
            if(maxStr.length() < tempStr.length()){
                maxStr = tempStr;
            }
        }

        return maxStr.length();
    }
}
