public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Apppppppekshaaaaaaaaa";

        String s = "";

        for(Character c : str.toCharArray()){
            if(s.indexOf(c) == -1){
                s += c;
            }
        }
        System.out.println(s);
    }
}
