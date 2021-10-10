package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class _27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
     int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
               nums[i]=Integer.MAX_VALUE;
            }else{
                j++;
            }
        }
        Arrays.sort(nums);

        return j;
    }

    public static void main(String[] args) {
    int[] nums=new int[]{ 0,1,2,2,3,0,4,2};
      int val=2;
        System.out.println(removeElement(nums,val));
        Stream.of(Arrays.asList(nums)).forEach(System.out::println);
    }
}
