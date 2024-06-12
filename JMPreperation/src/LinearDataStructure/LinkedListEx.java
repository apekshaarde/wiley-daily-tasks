package LinearDataStructure;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListEx{
    static void printNode(Node node){
        Node curr = node;
        for (;curr!=null;curr = curr.next){
            System.out.print(curr.data+"-->");
        }
        System.out.print("null");
    }

    public static Node insertAtFirst(Node head, int  data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return newNode;
    }
    public static Node deleteLastNode(Node tail){
        Node temp = tail;
        while (temp.next.next!=null){

        }
        return tail;
    }
    public static void main(String[] args) {
        Node node = null;
        node = insertAtFirst(node,10);
        node = insertAtFirst(node,20);
        node = insertAtFirst(node, 30);
        node = insertAtFirst(node, 40);
        node = insertAtFirst(node, 50);
        node = insertAtFirst(node,90);

        System.out.println("Before adding first element : ");
        printNode(node);
         node = insertAtFirst(node,0);
         node = insertAtFirst(node,1);
        System.out.println("After adding zero : ");
        printNode(node);
    }
}