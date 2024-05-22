package ArraysApp;

import java.util.Scanner;

public class StackOperationsAgain {
    static int[] stack = new int[5];
    static int top = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.PUSH");
            System.out.println("2.Display");
            System.out.println("3.POP");
            System.out.println("4.Peek");
            System.out.println("5.Exit");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch){
                case 1 :
                    System.out.println("Enter the value to push : ");
                    int val = sc.nextInt();
                    boolean result = push(stack,val);
                    if (result) {
                        System.out.println(val+ " inserted successfully....");
                    }else{
                        System.out.println("stack is overflow");
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    int res = pop();
                    if(res!=-1){
                        System.out.println(res + " deleted successfully");
                    }else{
                        System.out.println("stack is underflow..");
                    }
                    break;
                case 4:
                    res = peek();
                    if(res!=-1){
                        System.out.println(res + " is peek of stack");
                    }else{
                        System.out.println("stack is empty");
                    }
                    break;
                case 5:
                    return;
            }
        }while(true);

    }

    public static boolean push(int[] stack,int val){
        if(top == (stack.length-1)){
            return false;
        }
        else {
            top++;
            stack[top] = val;
            return true;
        }
    }

    public static int pop(){
        if(top == -1){
            return -1;
        }
        else {
            int val = stack[top];
            top--;
            return val;
        }
    }

    public static void display(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i]+" ");
        }
    }

    public static int peek(){
        if(top == -1){
            return -1;
        }
        int value = stack[top];
        return value;
    }

}
