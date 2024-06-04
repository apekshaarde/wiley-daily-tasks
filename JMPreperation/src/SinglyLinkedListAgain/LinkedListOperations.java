package SinglyLinkedListAgain;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data  = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    public static void printList(Node head) {
        Node currNode = head;
        for (; currNode != null; currNode = currNode.next) {
            System.out.print(currNode.data + "-->");
        }
        System.out.println("null");
    }

    public static Node insertAtFirst(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next = node;
        return newNode;
    }

    public static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return head;
    }

    public static Node deleteLast(Node node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return null;
        }
        Node currNode = node;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        return node;
    }

    public static Node findMiddle(Node node) {
        if (node == null) {
            return null;
        }
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int searchKey(Node node, int key) {
        if (node == null) {
            return -1;
        }
        Node currNode = node;
        int index = 0;
        while (currNode != null) {
            if (currNode.data == key) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node node = null;

        node = insertAtFirst(node, 50);
        node = insertAtFirst(node, 40);
        node = insertAtFirst(node, 30);
        node = insertAtFirst(node, 20);
        node = insertAtFirst(node, 10);

        printList(node);

        node = insertAtFirst(node, 5);

        node = deleteLast(node);
        printList(node);

        Node middle = findMiddle(node);
        System.out.println("Middle of Linked List is : " + middle.data);

        if (searchKey(node, 1) != -1) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }


    }
}
