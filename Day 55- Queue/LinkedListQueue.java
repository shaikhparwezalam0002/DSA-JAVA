

public class LinkedListQ{
    public class Node{
        
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
        public Node front=null;
        public Node rear=null;

        public boolean isEmpty(){
            if(front==null){
                return true;
            }
            return false;
        }

        public void add(int data){
            Node node=new Node(data);
            if(front==null){
                front=rear=node;
            }
            rear.next=node;
            rear=node;
        }

        public int remove(){
            if(front==null){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int first=front.data;
            if(front==rear){
                front=rear=null;
            }
            else{
                Node temp=front.next;
                front.next=null;
                front=temp;
            }
            return first;
        }

        public int peek(){
            if(front==null){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int first= front.data;
            return first;
        }
        public void printQueue(){
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
    public static void main(String[] args) {
        LinkedListQ q=new LinkedListQ();
        q.add(10);
        q.add(20);
        q.add(30);
        q.printQueue();
        q.remove();
        System.out.println(q.peek());
        
    }
}
