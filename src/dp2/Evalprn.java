package dp2;

import java.util.Stack;

public class Evalprn {
    public static void main(String[] args) {
        /*
        Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Input: ["4", "13", "5", "/", "+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Output: 22
         */
        String[][]s=new String[][]{{"2", "1", "+", "3", "*"},
                {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"},
                {"4", "13", "5", "/", "+"}};
        for (String[] ss:s) {
            System.out.println(evalRPN(ss));
        }
    }
    public static int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> S = new Stack<Integer>();
        for (String s : tokens) {
            if(s.equals("+")) {
                S.add(S.pop()+S.pop());
            }
            else if(s.equals("/")) {
                b = S.pop();
                a = S.pop();
                S.add(a / b);
            }
            else if(s.equals("*")) {
                S.add(S.pop() * S.pop());
            }
            else if(s.equals("-")) {
                b = S.pop();
                a = S.pop();
                S.add(a - b);
            }
            else {
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }
}
