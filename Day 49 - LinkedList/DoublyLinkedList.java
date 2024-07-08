public class Doubly{
    public static class Node{
        private int data;
        private Node next;
        private Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private Node head;
    private Node tail;
    private static int size;
    public void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=tail=node;
            head.prev=null;
            return;
        }
        head.prev=node;
        node.next=head;
        node.prev=null;
        head=node;
    }
    public void addLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=tail=node;
            head.prev=null;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
    }
    public void printList(Node head){
        System.out.println("");
        while(head!=null){
            System.out.print(head.data+" ->");
            head=head.next;
        }
    }
    public void printTail(Node tail){
        System.out.println("");
        while(tail!=null){
            System.out.print(tail.data+" <-");
            tail=tail.prev;
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Remove operation is not possible");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Remove operation is not possible");
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public static void main(String[] args) {
        Doubly d=new Doubly();
        d.addFirst(30);
        d.addFirst(20);
        d.addFirst(10);
        d.addLast(40);
        d.addLast(50);
        d.printList(d.head);
        d.removeFirst();
        d.removeLast();
        d.printTail(d.tail);
    }
}
