package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeSubSetDivByprev {
    public static void main(String[] args) {
        int[] a = {5,9,18,54,108,540,90,180,360,720};
        System.out.println(largestDivisibleSubset(a));
    }
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int maxIndex=-1;
        int size=0;
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer>sub=new ArrayList<>();
            int p=nums[i];
            sub.add(p);
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%p==0){
                     p=nums[j];
                     sub.add(nums[j]);
                }
            }
            //if(sub.size()>size){
             ///   size=sub.size();
              //  maxIndex++;
                list.add(sub);
           // }

        }
        System.out.println(list);
        return null;
    }
}
