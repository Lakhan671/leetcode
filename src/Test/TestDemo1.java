package Test;

import java.util.HashSet;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] input = new int[]{7, -5, 6, 5, -8, 5, -5, 1, 7, 4, -1, -2, 1};
        int count=findPairs(input);
        System.out.println(count);
    }

    private static int findPairs(int[] input) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                if(i!=j && input[i]+input[j]==0){
                   set.add(input[i]);
                   set.add(input[j]);
                }
            }
        }
        return set.size()/2;
    }


}
