package recursion;

public class Abbreviations {
    public static void main(String[] args) {
        printAb("pep", "", 0, 0);
    }

    private static void printAb(String str, String asf, int count, int pos) {
        if (str.length() == pos) {
            if (count == 0) {
                System.out.println(asf);

            }else{
                System.out.println(asf+count);
            }
            return;
        }
        if(count>0)
        printAb(str, asf+count+str.charAt(pos), count, pos + 1);
        else
            printAb(str, asf+str.charAt(pos), count, pos + 1);

        printAb(str, asf, count + 1, pos + 1);
    }
}
