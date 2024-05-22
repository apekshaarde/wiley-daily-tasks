package com.example;

import java.sql.Statement;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String str = "([)] ";

        boolean res = checkParenthesis(str);
        if (res) {
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }

    public static boolean checkParenthesis(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch=='{') {
                stack.push(ch);
                continue;
            }

            if(stack.isEmpty())
                return false;
            char check;
            switch (ch){
                case ')':
                    check = stack.pop();
                    if(ch == '{' || ch == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(ch == '(' || ch == '{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(ch == '(' || ch == '[')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();
    }
}
