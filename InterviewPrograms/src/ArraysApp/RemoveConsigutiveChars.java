package ArraysApp;

public class RemoveConsigutiveChars {
    public static void main(String[] args) {

        String str = "aaaaaaaaaaabbbbbbbbbbxxxxxxxx";

        String res = removeCons(str);
        System.out.println("Result is : " +res);

    }

    public static String removeCons(String str){

        if(str == null || str.length() == 0){
            return str;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char prevChar = str.charAt(0);
        stringBuilder.append(prevChar);

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(currChar!=prevChar){
                stringBuilder.append(currChar);
                prevChar = currChar;
            }
        }
        return stringBuilder.toString();
    }
}
