package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RingRGB {
    public static void main(String[] args) {
        System.out.println(getCount());
    }
    static  int getCount(){
        String s="B0B6G0R6R0R6G9";
        Map<Character, HashSet<Character>> set=new HashMap<>();
        for(int i=0;i<s.length();i=i+2){
            set.putIfAbsent(s.charAt(i+1),new HashSet<>());
            set.get(s.charAt(i+1)).add(s.charAt(i));
        }
        AtomicInteger c= new AtomicInteger();
        set.forEach((a,b)->{
            if(b.size()>2){
                c.getAndIncrement();
            }
        });
       return  c.intValue();
    }
}
