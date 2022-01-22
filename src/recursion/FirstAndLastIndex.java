package recursion;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] a = new int[]{11, 2, 3, 7, 50, 6, 7, 80, 9, 10};
        System.out.println(index(a, 0,7));
        System.out.println(index(a, 0,75));
        System.out.println("----------------");
        System.out.println(index_Last(a,0,7));
    }

    private static int index(int[] a, int i, int ix) {
        if (a.length == i) {
            return -1;
        }
        if (a[i] == ix) {
            return i;
        }
        return index(a, i + 1, ix);
    }
    private static int index_Last(int[] a, int i, int ix) {
        if (a.length == i) {
            return -1;
        }

        int c= index_Last(a, i + 1, ix);
          if(c==-1){
              if(a[i]==ix){
                  return i;
              }else{
                  return -1;
              }
          }else{
              return c;
          }
    }
}
