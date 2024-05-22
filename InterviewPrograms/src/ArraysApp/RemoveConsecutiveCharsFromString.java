package ArraysApp;

public class RemoveConsecutiveCharsFromString {

    public static void main(String[] args) {
        String str = "aaabbcddd";

        String result = removeConsicutive(str);
        System.out.println("String is : "+result);
    }

    public static String removeConsicutive(String str){
        StringBuilder stringBuilder = new StringBuilder();

        if(str == null || str.length() == 0){
            return str;
        }

        char prevChar = str.charAt(0);
        stringBuilder.append(prevChar);

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(currChar != prevChar){
                stringBuilder.append(currChar);
                prevChar = currChar;
            }
        }
        return stringBuilder.toString();
    }

}
