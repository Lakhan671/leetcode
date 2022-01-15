package Test;

public class Test_2 implements Runnable{
    public static void main(String[] args) {
        Test_2 t1=new Test_2();
        Test_2 t11=new Test_2();
        Thread t=new Thread(t1);
               t.setName("T-1");
        Thread t2=new Thread(t11);

        t2.setName("T-2");
        t.start();
        t2.start();
    }
     volatile  boolean  status=true;
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(Thread.currentThread().getName().equals("T-1") && status){
                System.out.println(Thread.currentThread().getName()+"="+i);
                status=!status;
            }else if(Thread.currentThread().getName().equals("T-2") &&!status){
                System.out.println(Thread.currentThread().getName()+"="+i);
                status=status;
            }
        }
    }
}
