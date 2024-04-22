import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text to count Words : ");
        String text = sc.nextLine();

        int textCount = countWords(text);
        System.out.println("Count : "+textCount);

        String line = "This is\na\nsample text.";

        int checkLineCount = countLines(line);
        System.out.println("Line Count : "+checkLineCount);

        System.out.println("Enter text to reverse: ");
        String reverseString = sc.nextLine();

        String reverseResult = reverseText(reverseString);
        System.out.println("Reverse String is:"+reverseResult);

        System.out.println("Enter the String to remove duplicates : ");
        String rDuplicates = sc.nextLine();

        String nonDuplicate =removeDuplicates(rDuplicates);
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
            char ch[] = text.toCharArray();
            String res="";
            for(int i=0;i<ch.length;i++){
                for (int j=(i+1);j<ch.length;j++){
                    if(ch[i] == ch[j]){
                        ch[j] = ' ';
                    }
                }
                if(ch[i] != ' '){
                    res += ch[i];
                }
            }
            return res;
    }
}
