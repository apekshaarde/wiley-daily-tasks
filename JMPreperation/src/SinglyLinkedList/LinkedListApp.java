package SinglyLinkedList;
class Node{
    int data;
    Node next;
    static int size = 0 ;

    public Node(int data){
        this.data = data;
        this.next = null;
        size++;
    }
}
public class LinkedListApp {
    public static void printList(Node head){
        Node currNode = head;
        for(;currNode!=null;currNode = currNode.next){
                System.out.print(currNode.data+"--->");
        }
        System.out.println("null");
    }
    public static Node insertAtFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static Node deleteLastNode(Node head){
        if (head == null) {
            return null;
        }
        if(head.next == null){
            Node.size--;
            return null;
        }
        Node.size--;
        Node currNode = head;
        while (currNode.next.next != null){
            currNode = currNode.next;
        }

        currNode.next = null;
        Node.size--;
        return head;
    }
    public static int searchKey(int sData, Node head){
        if(head == null){
            return -1;
        }
        Node currNode = head;
        int index = 0;
        while (currNode!=null){
            if(currNode.data == sData){
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }
    public static Node findMiddle(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        int mid = count/2+1;
        temp = head;
        while (temp != null){
            mid = mid - 1;
            if(mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void addLast(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        Node.size++;
    }
    public static int getSize(){
        return Node.size;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//
//        Node node = new Node(arr[0]);
//        node.next = new Node(arr[1]);
//        node.next.next = new Node(arr[2]);
//        node.next.next.next = new Node(arr[3]);

        Node node = null;

        node = insertAtFirst(node,50);
        node = insertAtFirst(node, 40);
        node = insertAtFirst(node, 30);
        node = insertAtFirst(node,20);
        node = insertAtFirst(node,10);
        printList(node);
        if(searchKey(50,node)!=-1){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
        Node middleNode = findMiddle(node);
        System.out.println("Middle of Linked List is : "+middleNode.data);
        deleteLastNode(node);
        printList(node);
        middleNode = findMiddle(node);
        System.out.println("Middle after deleteion : "+middleNode.data);
        printList(node);
        addLast(node,60);
        printList(node);
        int size = getSize();
        System.out.println("Size of Linked List is : "+size);
    }
}
