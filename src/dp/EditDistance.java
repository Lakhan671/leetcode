package dp;

public class EditDistance {
    public static void main(String[] args) {
        String w1="inside";
        String w2="index";
        System.out.println(dist(w1,w2,0,0));
    }
    public static int dist(String w1,String w2,int i,int j){
        if(i==w1.length()){
            return w2.length()-j;
        }else if(j==w2.length()){
            return w1.length()-i;
        } else if(w1.charAt(i)==w2.charAt(j)){
            return dist(w1,w2,i+1,j+1);
        }else{
            return 1+Math.min(Math.min(dist(w1,w2,i+1,j),dist(w1,w2,i,j+1)),dist(w1,w2,i+1,j+1));
        }
    }
}
