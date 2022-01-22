package recursion;

public class Encoding {
    public static void main(String[] args) {
        encoding("1203","");
    }

    private static void encoding(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        if(s.length()==1){
            char ch=s.charAt(0);
            if(ch=='0'){
            return;
            }else{
                int chv=ch-'0';
                char code=(char)('a'+chv-1);
                ans+=code;
                System.out.println(ans);
            }
        }else{

        }
    }
}
