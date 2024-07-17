
import java.util.Stack;

public class QueueUsingStack2{
    static Stack<Integer> queue=new Stack<>();
    static Stack<Integer> temp=new Stack<>();

    
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void add(int data){
        queue.push(data);
    }

    public int peek(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        int peek=temp.peek();
        while(!temp.isEmpty()){
            queue.push(temp.pop());
        }
        return peek;
    }

    public int remove(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        while(!queue.isEmpty()){
            temp.push(queue.pop());
        }
        int peek=temp.pop();
        while(!temp.isEmpty()){
            queue.push(temp.pop());
        }
        return peek;
    }



    public static void main(String[] args) {
        StackQueue sq=new StackQueue();
        System.out.println(sq.isEmpty());//false;
        sq.peek(); //empty
        
        sq.add(10);//add 10
        sq.add(20);//add 20
        sq.add(30); //add 30
        System.out.println(sq.remove()); //remove 10
        System.out.println(sq.peek()); // 20
        System.out.println(sq.isEmpty()); //not empty
        sq.add(30);     
        sq.remove();
        System.out.println(sq.peek()); // 30
    }
}
