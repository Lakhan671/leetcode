package array;

import java.util.LinkedHashMap;
import java.util.Map;

public class EncodeDecode {
    public String encode(String ss,String s){
        String en="";
        int c=0;
        for(char i:s.toCharArray()){
            int d=Integer.parseInt(""+i);
            for(int j=0;j<d;j++){
                en+=ss.charAt(c);
            }
            c++;
        }
        for(;c<ss.length();c++){
            en+=ss.charAt(c);
        }
        return  en;
    }
public String decode(String str,String num){
        String dec="";
    LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
    for(char c:str.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }

    for(Map.Entry<Character,Integer>i:map.entrySet()){
       dec+=i.getKey();
    }
    return dec;
}
    public static void main(String[] args) {
        EncodeDecode ed=new EncodeDecode();
       String en=new EncodeDecode().encode("code","1234");
        System.out.println(en);
        System.out.println(ed.decode(en,"123"));
    }
}
