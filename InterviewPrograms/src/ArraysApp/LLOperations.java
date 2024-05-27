package ArraysApp;

public class LLOperations {

    private int size;
    Node head;
    public LLOperations(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondLast = head;

        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }
    public  int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LLOperations operations = new LLOperations();
        operations.addFirst("e");
        operations.addFirst("d");
        operations.addFirst("c");
        operations.addFirst("b");
        operations.printList();
        System.out.println(operations.getSize());
        operations.addLast("f");
        operations.printList();
        System.out.println(operations.getSize());
        operations.removeFirst();
        operations.printList();
        operations.removeLast();
        operations.printList();
        System.out.println(operations.getSize());
    }
}
