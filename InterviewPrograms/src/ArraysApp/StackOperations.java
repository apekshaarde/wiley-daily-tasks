package ArraysApp;

import java.util.Scanner;

public class StackOperations {
    static int[] stack = new int[5];
    static int top = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.PUSH");
            System.out.println("2.Display");
            System.out.println("3.POP");
            System.out.println("4.Exit");

            System.out.println("Enter Choice : ");
            int ch = sc.nextInt();

            switch (ch){
                case 1 :
                    System.out.println("Enter value to push : ");
                    int val = sc.nextInt();
                    boolean res = push(stack,val);
                    if(res){
                        System.out.println("value pushed ");
                    }else{
                        System.out.println("stack is overflow");
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    int result = pop();
                    if(result!=-1){
                        System.out.println(result+" is deleted from stack");
                    }else{
                        System.out.println("stack is underflow");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }while (true);

    }
    public static boolean push(int stack[], int val){
        if(top == (stack.length-1)){
            return false;
        }
        else {
            top++;
            stack[top] = val;
            return true;
        }
    }

    public static void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }

    public static int pop(){
        if(top == -1){
            return -1;
        }
        else {
            int val = stack[top];
            top -= 1;
            return val;
        }
    }
}
