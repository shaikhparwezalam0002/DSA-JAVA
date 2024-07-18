
import java.util.Deque;
import java.util.LinkedList;

public class DQstack{
    Deque<Integer> dq=new LinkedList<>();
    public void push(int data){
        dq.addLast(data);
    }
    public int pop(){
        return dq.removeLast();
    }
    public boolean isEmpty(){
        return dq.isEmpty();
    }
    public int peek(){
        return dq.getLast();
    }

    public static void main(String[] args) {
        DQstack ds=new DQstack();
        ds.push(10);
        ds.push(20);
        System.out.println(ds.peek());
        System.out.println(ds.pop());
        System.out.println(ds.isEmpty());
    }
}
