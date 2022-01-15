package dp;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NoOfStringTypeOFTarget {
    public static void main(String[] args) {
        System.out.println(rec("purple",new String[]{"purp","p","ur","le","purple"}));
    }
    public static ArrayList<LinkedList<String>> rec(String ta,String[] wordBank){
        if(ta.equals("")){
            ArrayList<LinkedList<String>> a=new ArrayList<LinkedList<String>>();
            a.add(new LinkedList<String>());
            return a;

        }
        ArrayList<LinkedList<String>> r=new ArrayList<>();
        for(String word:wordBank){
            if(ta.indexOf(word)==0){
                String suffix=ta.substring(word.length());
                ArrayList<LinkedList<String>>all=rec(suffix,wordBank);
                all.forEach(p->{
                    p.addFirst(word);
                });
                r.addAll(all);
            }
        }
        return r;
    }
}
