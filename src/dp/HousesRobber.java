package dp;

public class HousesRobber {

    public static void main(String[] args) {
        int[] houses=new int[]{4,8,12,1,2,10,3,6,8};
        System.out.println(getRobberMony(houses,0));
    }
    public static int getRobberMony(int[] houesMoney,int i){
        if(i>=houesMoney.length){
            return 0;
        }else{
            return Math.max(houesMoney[i]+getRobberMony(houesMoney,i+2),getRobberMony(houesMoney,i+1));
        }

    }
}
