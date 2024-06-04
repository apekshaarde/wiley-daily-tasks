package com.program;

public class ReverseOnlyCharacters {
    public static void main(String[] args) {
        String str = "Ape12#$ks@!h45a";
        String result = reverseOnlyChars(str);
        System.out.println("String is : "+result);
    }
    public static String reverseOnlyChars(String str){
        int start = 0;
        int last = str.length()-1;

        char[] ch =str.toCharArray();
        while (start < last){
            if(Character.isLetterOrDigit(ch[start]) && Character.isLetterOrDigit(ch[last])){
                char temp = ch[start];
                ch[start] = ch[last];
                ch[last] = temp;
                start++;
                last--;
            }
            else if(!Character.isLetterOrDigit(ch[start])){
                start++;
            }else if(!Character.isLetterOrDigit(ch[last])){
                last--;
            }
        }
        return String.valueOf(ch);
    }
}
