package AllIterviewProgram;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String str = "leetcode";

        Map<Character,Integer> map = new TreeMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map. entrySet()){
            if(entry.getValue()  == 1){
                System.out.println(entry.getKey());
                break;
            }
        }

        //map.forEach((k,v)-> System.out.println(k+"-->"+v));
    }
}
