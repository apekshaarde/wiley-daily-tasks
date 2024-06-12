package AllIterviewProgram;

public class FindFirstOccurenceUsingBruteForce {
    public static void main(String[] args) {
        String str = "aaapeksha";

        char[] chars = str.toCharArray();
        for(int i=0;i< chars.length;i++){
            int count = 1;
            for(int j=(i+1);j<chars.length;j++){
                if(chars[i] == chars[j]){
                    count++;
                    chars[j] = ' ';
                }
            }
            if(chars[i] != ' '){
                System.out.println(chars[i]+"--->"+count);
                //break;
            }
        }
    }
}
