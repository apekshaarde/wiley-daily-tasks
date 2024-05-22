package ArraysApp;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "{[]}";
        String s3 = "{{{}}]";

        System.out.println(getValidString(s1));
        System.out.println(getValidString(s2));
        System.out.println(getValidString(s3));
    }
    public static boolean getValidString(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            switch (c){
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop()!='{')
                        return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop()!='(')
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop()!='[')
                        return false;
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
