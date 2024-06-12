package LinearDataStructure;

import java.util.Scanner;

public class StackExample {
    static int top = -1;
    static int stack[] = new int[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.PUSH");
            System.out.println("2.Display");
            System.out.println("3.POP");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter value to Push : ");
                    int val = sc.nextInt();
                    boolean b = push(stack,val);
                    if(b){
                        System.out.println("inserted successfully");
                    }else{
                        System.out.println("Stack is full");
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    int delVal = pop(stack);
                    if(delVal!=-1){
                        System.out.println(delVal+" deleted successfully from stack");
                    }else {
                        System.out.println("stack is empty");
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (true);
    }

    public static boolean push(int stack[],int val){
        if(top == stack.length-1){
           return false;
        }else{
            top++;
            stack[top] = val;
            return true;
        }
    }

    public static void display(){
        for (int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static int pop(int[] stack){
        if(top == -1){
            return -1;
        }else {
            int val = stack[top];
            top--;
            return val;
        }
    }
}
