package array;

import java.util.stream.Stream;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int c=0;
        String s="";
        int[] a=new int[nums.length];
        for(int i:nums){
            if(!s.contains(String.valueOf(i))){

                s+=i;
                a[c]=i;
                c++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                nums[i]=a[i];
            }

        }
        nums=a;
        return c+1;
    }

    public static void main(String[] args) {
        int [] a=new int[]{1,2,2};
        System.out.println( removeDuplicates(a)   );
        Stream.of(a).forEach(System.out::println);
    }
}
