package array;

import java.util.HashSet;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(34);
        set.forEach(p->{
            System.out.println(p);
        });
        for(int d:set){
            System.out.println(d);
        }
    }
}
