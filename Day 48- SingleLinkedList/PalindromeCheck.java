public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addFirstNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLastNode(int data) {
        Node node = new Node(data);
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void printNode(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        // System.out.println(head.data);

    }

    public void addMiddleNode(Node head, int pos, int data) {
        Node curr = head;
        int len = findLength(curr);
        if (pos > len) {
            System.out.println("Insertion not possible");
            return;
        }
        Node node = new Node(data);
        if (head == null) {
            head = tail = curr;
            return;
        }
        for (int i = 0; i < pos - 2; i++) { // traverse the linkedlist temp node to pos-1 position
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }

    public boolean palindromeCheck(Node head) {
        Node temp = head;
        Node mid = findMid(temp);
        Node revPart = reverseLinkedList(mid);
        // printNode(head);
        while (revPart != null) {
            int a = revPart.data;
            int b = head.data;
            if (a != b) {
                return false;
            }
            head = head.next;
            revPart = revPart.next;
        }
        return true;
    }

    public Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        return head;
    }

    // first find the middle of a linkedlist by using slow-fast technique.
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1 times moving forward
            fast = fast.next.next; // +2 times moving forward
        }
        return slow;
    }

    public static int findLength(Node head) {
        Node curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirstNode(10);
        ll.addLastNode(20);
        ll.addLastNode(30);
        ll.addLastNode(20);
        ll.addLastNode(20);

        // ll.addMiddleNode(ll.head, 2, 50);
        // ll.addMiddleNode(ll.head, 5, 60);
        // ll.addMiddleNode(ll.head, 6, 65);
        // ll.addMiddleNode(ll.head, 5, 650);
        ll.printNode(ll.head);
        // Node x = ll.findMid(ll.head);
        // System.err.println(x.data);

        boolean check = ll.palindromeCheck(ll.head);
        if (check) {
            System.err.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
