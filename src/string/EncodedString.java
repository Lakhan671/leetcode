package string;

public class EncodedString {
    public static String encode(String str){
        String out="";
        int j=1;
        for(int i=0;i<str.length();i++){
         if((i+1)<str.length()&&str.charAt(i)==str.charAt(i+1)){
                 j++;
             }else {
             if (j == 1) {
                 out += str.charAt(i);
             } else {
                 out += str.charAt(i) + "" + j;
                 j = 1;
             }
         }

        }
        return  out;
    }
    public static String decode(String str){
        String out="";
        for(int i=0;i<str.length();i++){
            if(i+1<str.length()){
                char c = '1';
                int n=0;
                if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                     c=str.charAt(i);
                }
                if(!(str.charAt(i+1)>='a' &&str.charAt(i+1)<='z')){
                    n=Integer.parseInt(str.charAt(i+1)+"");
                }
                if(n==0 && c!='1'){
                    out+=c;
                }else{
                    for(int j=0;j<n;j++){
                        out+=c;
                    }
                }


            }

        }
        return  out;
    }

    public static void main(String[] args) {
        System.out.println(decode(encode("yyyybbbbdexxxxxxx")));
    }
}
