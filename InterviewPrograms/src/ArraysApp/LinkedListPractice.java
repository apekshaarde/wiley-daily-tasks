package ArraysApp;

public class LinkedListPractice {

    private int size;

    public LinkedListPractice(){
        this.size = 0;
    }
        Node head;
        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
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
                System.out.println("list is empty");
                return;
            }

            Node currNode = head;
            while (currNode.next!=null){
                currNode = currNode.next;
            }

            currNode.next = newNode;

        }

        public void printList(){
            if(head == null){
                System.out.println("list is null");
                return;
            }

            Node currNode = head;
            while (currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }

        public void removeFirst(){
            if(head == null){
                System.out.println("List is empty");
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
            if(head == null ){
                head = head.next;
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

        public int searchElement(int sData){
            if(head == null){
                System.out.println("list is empty");
                return -1;
            }
            Node currNode = head;
            int i=0;
            while (currNode!=null){
                if(currNode.data == sData){
                    return i;
                }
                currNode = currNode.next;
                i++;
            }
            return -1;
        }

        public int getSize(){
            return size;
        }

    public static void main(String[] args) {
        LinkedListPractice practice = new LinkedListPractice();
        practice.addFirst(3);
        practice.addFirst(2);
        practice.addFirst(1);
        practice.printList();
        practice.addLast(4);
        practice.addLast(5);
        practice.printList();
        System.out.println("Size : "+practice.getSize());
        practice.removeFirst();
        practice.printList();
        System.out.println("Size : "+practice.getSize());
        practice.removeLast();
        practice.printList();
        System.out.println("Size : "+practice.getSize());

        int res = practice.searchElement(4);
        if(res!=-1){
            System.out.println("element is present at index : "+res);
        }else{
            System.out.println("element not fount");
        }
    }
}
