package ArraysApp;

import java.util.Scanner;

public class QueueDataStructure {
    static int[] queue = new int[10];
    static int rear = -1;
    static int front = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.PUSH");
            System.out.println("2.Display");
            System.out.println("3.POP");
            System.out.println("4.PEEK");
            System.out.println("5.Exit");
            System.out.println("enter your choice : ");
            int ch = sc.nextInt();

            switch (ch){
                case 1 :
                    System.out.println("Enter value to insert : ");
                    int val = sc.nextInt();
                    boolean res = push(queue,val);
                    if (res) {
                        System.out.println(val+" inserted successfully....");
                    }else{
                        System.out.println("queue is full");
                    }
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    int result = pop();
                    if(result!=-1){
                        System.out.println(result+" is deleted from queue");
                    }else{
                        System.out.println("queue is empty");
                    }
                    break;
                case 4:
                    result = peek();
                    if(result!=-1){
                        System.out.println(result+" is peek of queue");
                    }else{
                        System.out.println("queue is empty");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }while (true);

    }

    public static boolean push(int[] queue,int val){
        if(rear == (queue.length-1)){
            return false;
        }
        else{
            rear++;
            queue[rear] = val;
            return true;
        }
    }

    public static void display(){
        if(rear == -1 || front == (rear+1)){
            System.out.println("queue is underflow");
        }else {
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]+" ");
            }
        }
    }

    public static int pop(){
        if(rear == -1 || front == (rear+1)){
            return -1;
        }else {
            int value = queue[front];
            front++;
            return value;
        }
    }

    public static int peek(){
        if(rear==-1 || front==(rear+1)){
            return -1;
        }else{
            int val = queue[front];
            return val;
        }
    }

}
