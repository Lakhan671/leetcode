package recursion;

public class TragetSum {
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,30,50,40};
        printSets(arr,0,"",0,70);
    }

    private static void printSets(int[] arr, int index, String set, int sos, int target) {
        if(index==arr.length){
            if(sos==target){
                System.out.println(set);

            }
            return;
        }
        printSets(arr,index+1,set+arr[index]+",",sos+arr[index],target);
        printSets(arr,index+1,set,sos,target);
    }
}
