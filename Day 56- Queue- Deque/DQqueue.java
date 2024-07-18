
import java.util.Deque;
import java.util.LinkedList;

public class DQqueue{
    Deque<Integer> dq=new LinkedList<>();
    public void add(int data){
        dq.addLast(data);
    }
    public int remove(){
        return dq.removeFirst();
    }
    public boolean isEmpty(){
        return dq.isEmpty();
    }
    public int peek(){
        return dq.getFirst();
    }

    public static void main(String[] args) {
        DQqueue ds=new DQqueue();
        ds.add(10);
        ds.add(20);
        System.out.println(ds.peek());
        System.out.println(ds.remove());
        System.out.println(ds.isEmpty());
        
    }
}
