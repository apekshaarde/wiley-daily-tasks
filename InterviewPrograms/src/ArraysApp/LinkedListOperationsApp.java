package ArraysApp;

import java.util.Scanner;

public class LinkedListOperationsApp {
    Node head;

    private int size;
    public LinkedListOperationsApp(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head ;
        while (currNode.next!=null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void removeFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondLast = head;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int searchNumber(int searchNumber){
        if(head == null){
            return -1;
        }

        Node currNode = head;
        int i=0;
        while(currNode!=null){
            if(currNode.data == searchNumber){
                return i;
            }
            currNode = currNode.next;
            i++;
        }
        return -1;
    }

    public void deleteApp(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;

        while (currNode!=null && currNode.next!=null){
            if(currNode.next.data>25){
                currNode.next = currNode.next.next;
                size--;
            }else{
                currNode = currNode.next;
            }
        }
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListOperationsApp app = new LinkedListOperationsApp();
//        app.addFirst(2);
//        app.addFirst(1);
//        app.addFirst(7);
//        app.addFirst(8);
//        app.addFirst(9);
//        int res = app.searchNumber(2);
//        if(res!=-1){
//            System.out.println("element found at position : "+res);
//        }else{
//            System.out.println("list is empty or element not present");
//        }
//        app.printList();

        for (int i=50;i>=1;i--){
            app.addFirst(i);
        }
        app.printList();
        System.out.println("Size of LL is : "+app.getSize());
        app.deleteApp();
        app.printList();
        System.out.println("Size of LL after Deletion is : "+app.getSize());



    }
}
