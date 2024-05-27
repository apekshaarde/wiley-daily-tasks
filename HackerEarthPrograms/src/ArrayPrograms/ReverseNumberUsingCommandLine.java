package ArrayPrograms;

public class ReverseNumberUsingCommandLine {
    public static void main(String[] args) {
        int reverse = 0;
        int no = Integer.parseInt(args[0]);

        while(no!=0){
            int rem = no%10;
            reverse = reverse*10+rem;
            no /= 10;
        }
        System.out.println("Reversed Number is : "+reverse);
    }
}
