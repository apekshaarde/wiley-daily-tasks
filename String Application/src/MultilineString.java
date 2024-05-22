public class MultilineString {
    public static void main(String[] args) {
        String res = getData();
        System.out.println(res);

        String data = StringBuilder();
        System.out.println(data);
    }

    public static String getData(){
        return String.join("\n","get busy living","or","get busy duying");
    }

    public static String StringBuilder(){
        return new StringBuilder().append("Hello").append("\n").append("How Are u?").append("\n").append("I am fine").toString();
    }
}
