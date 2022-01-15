package array;

public class Combination {
    public static void main(String[] args) {
        int []a=new int[]{2,1,3,0};
        for(int i=0;i<a.length;i++){
            String s="";
                    s+=a[i];
            for(int j=0;j<a.length;j++){

                if(i!=j){
                    s+=a[j];
                }

            }
        }
    }
}
