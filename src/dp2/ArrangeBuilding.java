package dp2;

public class ArrangeBuilding {
    // no building in front of each other
    /*
     B S B SS B
     S B S B  S
     */
    public static void main(String[] args) {
        int n=3;
        int oB=1;
        int oS=1;
        for (int i=2;i<=n;i++){
            int newB=oS;
            int newS=oB+oS;
            oS=newS;
            oB=newB;

        }
        int total=oB+oS;
        total=total*total;
        System.out.println(total);
    }
}
