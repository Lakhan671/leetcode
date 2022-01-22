package recursion;

public class AllIndexes {
    public static void main(String[] args) {
        int[] a = new int[]{7, 2, 3, 7, 50, 6, 7, 80, 9, 7};
                  //indexes=0   1  2  3  4  5  6   7   8  9
        int[] indexes=findIndexes(a,0,7,0);
        for(int i:indexes){
            System.out.println(i);
        }

    }
    static int[] findIndexes(int[]a,int index,int n,int fsf){
        if(a.length==index){
            return new int[fsf];
        }
        if(a[index]==n){
           int[]array= findIndexes(a,index+1,n,fsf+1);
           array[fsf]=index;
           return array;

        }else{
           int[] array= findIndexes(a,index+1,n,fsf);
           return array;
        }

    }
}
