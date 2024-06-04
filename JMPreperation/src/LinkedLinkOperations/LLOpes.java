package LinkedLinkOperations;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class LLOpes {
    public static void main(String[] args) {

        Node node = null;

        node = insertAtFirst(node,50);
        node = insertAtFirst(node,40);
        node = insertAtFirst(node, 30);
        node = insertAtFirst(node, 20);
        node = insertAtFirst(node, 10);
        node = insertAtFirst(node, 5);

        printList(node);

        int middleNode = findMiddle(node);
        System.out.println("Middle of Linked List is : "+middleNode);
        System.out.println("After deletion");
        node = deleteLast(node);
        printList(node);
        int res = searchKey(node, 30);
        if(res != -1){
            System.out.println("Present at "+res+" index");
        }else{
            System.out.println("Not Present");
        }

        node = deleteMiddle(node);
        printList(node);

        node = insertLast(node, 45);
        printList(node);

        node = insertLast(node, 50);
        printList(node);
    }

    public static void printList(Node node){
        Node currNode = node;

        for(;currNode != null;currNode = currNode.next){
            System.out.print(currNode.data+"--->");
        }
        System.out.println("null");
    }
    public static Node insertAtFirst(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }

        newNode.next = head;
        head = newNode;
        return newNode;
    }
    public static int findMiddle(Node node){
        Node currNode = node;

        int count = 0;
        while (currNode.next != null){
            count++;
            currNode = currNode.next;
        }

        Node temp = node;
        int mid = count/2+1;

        while (temp.next != null){
            mid = mid - 1;
            if(mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp.data;
    }

    public static Node deleteLast(Node node){
        Node currNode = node;

        while (currNode.next.next != null){
            currNode = currNode.next;
        }

        currNode.next = null;

        return node;
    }

    public static int searchKey(Node node,int key){
        if(node == null){
            return -1;
        }

        Node currNode = node;
        int index = 0;
        while (currNode != null){
            if(currNode.data == key){
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public static Node deleteMiddle(Node node){
        Node currNode = node;
        int count = 0;
        while (currNode != null){
            count++;
            currNode = currNode.next;
        }

        currNode = node;
        int mid = count/2;
        while (currNode.next != null){
            mid--;
            if(mid == 0){
                Node middleNode = currNode.next;
                currNode.next = currNode.next.next;
                break;
            }
            currNode = currNode.next;
        }
        return node;
    }

    public static Node insertLast(Node node, int data){
        Node currNode = node;
        Node newNode = new Node(data);
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
        return node;
    }
}
