package ArraysApp;

public class LinkedListOperations {
    Node head;
    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        //operations of linkedList-> addFirst,addMiddle,addLast

        public void addFirst(String data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

      public void addLast(String data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node lastNode = head;

            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
      }

      public void printList(){
            Node currNode = head;

            while (currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }

          System.out.println("null");
      }

    public static void main(String[] args) {

        LinkedListOperations ll = new LinkedListOperations();
        ll.addFirst("Apeksha");
        ll.addFirst("is");
        ll.printList();
        ll.addLast("Arde");
        ll.printList();

    }
}
