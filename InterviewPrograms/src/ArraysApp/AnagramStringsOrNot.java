package ArraysApp;

public class AnagramStringsOrNot {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean res = isAnagramString(s1,s2);
        if(res){
            System.out.println("Anagram Strings");
        }else{
            System.out.println("not anagram");
        }
    }

    public static boolean isAnagramString(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for(int i=0;i<c1.length;i++){
            for(int j=(i+1);j<c1.length;j++){
                if(c1[i] > c1[j]){
                    char temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
        }
        System.out.println("String 1 : "+String.valueOf(c1));

        for(int i=0;i<c2.length;i++){
            for(int j=(i+1);j<c2.length;j++){
                if(c2[i] > c2[j]){
                    char temp = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp;
                }
            }
        }

        System.out.println("String 2 : "+String.valueOf(c2));

        if(c1.length == c2.length)
            return true;
        else
            return false;
    }
}
