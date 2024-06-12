package AllIterviewProgram;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "{})";
        boolean b = checkString(str);
        if(b){
            System.out.println("Valid String");
        }else{
            System.out.println("Invalid");
        }
    }
    public static boolean checkString(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{'){
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
