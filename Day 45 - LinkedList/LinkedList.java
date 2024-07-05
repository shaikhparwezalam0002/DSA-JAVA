public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head; // Instance variable
    private Node tail; // Instance variable
    private static int size=0;
    public void addFirst(int data){
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }
    public void addLast(int data){
        Node n=new Node(data);
        if(head ==null && tail==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void addMiddle(int data,int pos){
        Node n=new Node(data);
        int i=0;
        Node curr=head;
        if(pos<=0){
            if(head==null){
                head=tail=n;
            }
            else{
                n.next=head;
                head=n;
            }
            size++;
            return;
        }
        while(curr!=null && i<pos){
            curr=curr.next;
        }
        if(i==pos-1){
            n.next=curr.next;
            curr.next=n;
            if(n.next==null){
                tail=n;
            }
        }else{//at last if the pos is not available 
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void reverseList(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node temp=head;
        head=tail;
        tail=temp;
    }
    public void printNode(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public int sizeLinkedList(){
        Node curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }
    public void firstRemove(){
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        size--;
    }
    public void lastRemove(){
        if(head==tail){
            head=tail=null;
        }
        else{
            Node prev=head;
            for(int i=1;i<size-1;i++){
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
        }
        size--;
    }
    public int searchKey(int key){
        Node temp=head;
        // for(int i=0;i<size;i++){
        //     if(temp.data==key){
        //         return i;
        //     }
        //     temp=temp.next;
        // }
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
             }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int recurSearchKey(int key,Node tempNode){
        if(tempNode==null){
            return -1;
        }
        if(tempNode.data==key){
            return 0;
        }
        int sValue=recurSearchKey(key,tempNode.next);
        if(sValue==-1){
            return -1;
        }
        return sValue+1;
    }
    
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
       ll.addLast(30);
       ll.addMiddle(25, 5);
       ll.addMiddle(50, 2);
       ll.addMiddle(25, -1);
        ll.printNode();
        System.out.println("size : " +size);
        ll.firstRemove();
        ll.printNode();
       System.out.println("size : " +size);
       ll.lastRemove();
       ll.printNode();
       System.out.println("size : " +size);
        int pos=ll.searchKey(34);
       System.out.println("Key found at : "+pos);
       Node tempNode=ll.head;
       int pos1=ll.recurSearchKey(50,tempNode);
       System.out.println("Key found at : "+pos1);
      ll.reverseList();
      ll.printNode();
    }
}
