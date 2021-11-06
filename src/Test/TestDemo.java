package Test;

import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
     //  System.out.println(validate("[()]{}"));
       //])
        //[(])”
       // System.out.println(validate("[(])"));
       // System.out.println(validate(")("));
        System.out.println(validate("[()]{}{[()()]()}"));
        System.out.println(validate("{()}[](}"));
    }
    public static boolean validate(String str){
        Stack<String> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{'){
                stack.push("}");
            }
            if(str.charAt(i)=='}'){
                if(stack.size()>0 && stack.peek().equals("}")){
                    stack.pop();
                }
            }
            if(str.charAt(i)=='['){
                stack.push("]");
            }
            if(str.charAt(i)==']' ){
                if(stack.size()>0 &&  stack.peek().equals("]")){
                    stack.pop();
                }
            }

            if(str.charAt(i)=='('){
                stack.push(")");
            }
            if(str.charAt(i)==')'){
                if(stack.size()>0 && stack.peek().equals(")")){
                    stack.pop();
                }

            }
        }
        return stack.size()==0?true:false;
    }
}
