package stringapp;

import org.w3c.dom.ls.LSOutput;

public class StringAppendDiff {
    public static void main(String s[]){
        System.out.println("Strings += 1000 additions");
        Timer.time(new Runnable() {
            @Override
            public void run() {
                String s = "";
                for (int i = 0; i < 1000; i++) {
                    s += i;
                }
                System.out.println("Length : "+s.length());
            }
        });

        System.out.println("StringBuffer initial size with 300*1000");
        Timer.time(new Runnable() {
            @Override
            public void run() {
                StringBuilder sb = new StringBuilder();
                for (int i=0;i<300*1000;i++){
                    sb.append(i);
                }
                String s = sb.toString();
                System.out.println("Length of String : "+s.length());
            }
        });
    }
}
