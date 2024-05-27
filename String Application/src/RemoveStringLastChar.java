import java.util.Optional;

public class RemoveStringLastChar {
    public static void main(String[] args) {
            String res = removeLastChar("Apekshaa");
        System.out.println(res);

        String res1 = usingStream("zasssssssd");
        System.out.println(res1);
    }

    public static String removeLastChar(String s){
        return (s == null || s.length() == 0) ? null : s.substring(0,(s.length())-1);
    }

    public static String usingStream(String s){
        return Optional.ofNullable(s)
                .filter(str->str.length()!=0)
                .map(str-> str.substring(0,str.length()-1))
                .orElse(s);
    }
}
