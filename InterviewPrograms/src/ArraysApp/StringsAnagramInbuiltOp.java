package ArraysApp;

import java.util.Arrays;

public class StringsAnagramInbuiltOp {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silenzst";

        boolean res = isAnagram(s1,s2);
        if(res){
            System.out.println("Anagram");
        }else{
            System.out.println("not anagram");
        }
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
