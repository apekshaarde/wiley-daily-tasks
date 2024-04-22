import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text to count Words : ");
        String text = sc.nextLine();

        String str= """
                The String class in Java represents a sequence of characters.
                Strings in Java are immutable, meaning their values cannot be changed after they are created.
                 This immutability ensures thread safety and allows strings to be used as constants.
                """;

        int textCount = countWords(text);
        System.out.println("Count : "+textCount);

        String line = "This is\na\nsample text.";

        int checkLineCount = countLines(str);
        System.out.println("Line Count : "+checkLineCount);

        System.out.println("Enter text to reverse: ");
        String reverseString = sc.nextLine();

        String reverseResult = reverseText(reverseString);
        System.out.println("Reverse String is:"+reverseResult);

        System.out.println("Enter the String to remove duplicates : ");
        String rDuplicates = sc.nextLine();

        String nonDuplicate =removeDuplicates(str);
        System.out.println("String after removing duplicates : "+nonDuplicate);
    }
    private static int countWords(String text) {

        int count = 0;

        String words[] = text.split(" ");
        for(int i=0;i<words.length;i++){
            count++;
        }
        return count;
    }
    private static int countLines(String text) {
        int lineCount= 0;

        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == '\n'){
                lineCount++;
            }
        }
        return lineCount;
    }
    private static String reverseText(String text) {

        String reverseText ="";

        for(int i=text.length()-1;i>=0;i--){
            reverseText += text.charAt(i);
        }
        return reverseText;
    }

    private static String removeDuplicates(String text) {
            String ch[] = text.split(" ");
            String res="";
            for(int i=0;i<ch.length;i++){
                for (int j=(i+1);j<ch.length;j++){
                    if(ch[i] == ch[j]){
                        ch[j] = " ";
                    }
                }
                if(ch[i] != " "){
                    res += ch[i]+" ";
                }
            }
            return res;
    }
}
