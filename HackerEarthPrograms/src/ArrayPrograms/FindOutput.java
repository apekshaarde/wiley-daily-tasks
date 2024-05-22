package ArrayPrograms;

public class FindOutput {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int b[] = a;
        a = new int[]{70,80};

        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}
