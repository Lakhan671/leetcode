package Test;

public class Test456 {

    public static void main(String[] args) {
        int[]a=new int[]{1,2,3,4,5};
        int[] b=new int[]{1,2,3,44,55,60};
        sort(a,b);
    }
    static void sort(int[]a,int[]b){
        int[] newArr=new int[a.length+b.length];
        int k=0;
        int j=0;
        for(int i=0;i<a.length;){
            if(a[i]<b[k]){
                newArr[j]=a[i];
                a[k]=0;
                j++;
                i++;

            }else if(a[i]==b[k]){
                newArr[j]=a[i];
                newArr[j+1]=b[k];

                a[i]=0;
                b[k]=0;
                j+=2;
                k++;
                i++;
            }else{
                newArr[i]=a[i];
                j++;
                i++;
            }

        }
        for(int i:b){
            if(i!=0){
                newArr[j]=i;
                j++;
            }
        }
        for(int out:newArr){
            System.out.println(out);
        }
    }
}
//delete from emp_data where id not in (select id from (select distinct e.*  from  emp_data e));