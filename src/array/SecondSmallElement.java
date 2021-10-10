package array;

public class SecondSmallElement {
    public static void main(String[] args) {
        int[] at=new int[]{8,5,6,7,10};
        printSecondElement(at);
    }

    private static void printSecondElement(int[] at) {
        int c=0, i=0;
        int sec=at[0];
        int max=Integer.MAX_VALUE;
        while(c<2){
            sec=Math.min(sec,at[i]);
            if(i==at.length-1 && c==0){
               c++;i=0;
            }
            if(c==1 &&at[i]>sec){
                max=Math.min(at[i],max);
                if(i==at.length-1){
                    break;
                }
            }
            i++;
        }
        System.out.println(max);
    }
}
