package Test;

import java.util.LinkedHashMap;

public class StaticFinalVariable {
    final String name;
    static final String lName;
    StaticFinalVariable(){
        System.out.println("current class constructor");
        name="Lakhan";
    }
    static{
        lName="Singh";
        System.out.println(" current class static block");
    }
    {
        System.out.println("current class init block");
    }

    public static void main(String[] args) {
      BB b=new BB();

      Integer a=12;
      Integer a1=12;

        System.out.println(a==a1);
    }
}
class AA{
    AA(){
        System.out.println("AA constructor--1");
    }
    {
        System.out.println("AA init block--1");
    }
    static {
        System.out.println("AA static block--1");
    }
}
class BB extends  AA{
    BB(){
        System.out.println("BB constructor--1");
    }
    {
        System.out.println("BB init block--1");
    }
    static {
        System.out.println("BB static block--1");
    }
}
