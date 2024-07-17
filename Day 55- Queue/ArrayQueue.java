
import java.util.Scanner;

public class ArrayQ{

    public static class Queue{

        public static int queue[];
        public static int size;
        public static int rear;

        public Queue(int data){
            queue=new int[data];
            size=data;
            rear=-1;
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full now.");
                return;
            }
            rear=rear+1;
            queue[rear]=data;
        }
        public void printQueue(){
            if(rear==-1){
                System.out.println("Queue is empty now");
                return;
            }
            System.out.println("");
            for(int i=0;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
        public int remove(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int front=queue[0];
            for(int i=1;i<=rear;i++){
                queue[i-1]=queue[i];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return queue[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue q=new Queue(n);
        q.add(10);
        q.add(20);
        q.add(30);
        q.printQueue();
        q.remove();
        q.printQueue();
        System.out.println("\n"+q.peek());
    }
}
