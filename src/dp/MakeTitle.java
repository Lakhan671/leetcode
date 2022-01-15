package dp;

public class MakeTitle {
    public static String mak(String s){
      s=s.toLowerCase().trim();
      String out="";
      boolean isSpace=true;
      for(char c:s.toCharArray()){
          if(isSpace){
              out+=(char)(c-32);
              isSpace=false;
              continue;
          }
           if(c==' '){
              isSpace=true ;
              out+=c;
              continue;
           }else {
               isSpace=false;
           }
          out+=c;


      }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(mak("capiTalIze tHe titLe"));
    }
}
