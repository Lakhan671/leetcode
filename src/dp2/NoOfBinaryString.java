package dp2;
// No of binary string who have length 6 or 4
public class NoOfBinaryString {
    public static void main(String[] args) {
       int n=6;
       int oldZeroCount=1;
       int newOneCount=1;
       for (int i=2;i<=n;i++){
            int newZeroCont=newOneCount;
            int newOneCounts=oldZeroCount+newOneCount;
            oldZeroCount=newZeroCont;
            newOneCount=newOneCounts;

       }
        System.out.println(oldZeroCount+newOneCount);
    }
}
