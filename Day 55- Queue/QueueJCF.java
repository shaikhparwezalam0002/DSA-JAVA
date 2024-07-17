import java.util.LinkedList;
import java.util.Queue;
public class QueueJCF{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.remove()  /*q.peek()*/);
            //q.remove();
        }
    }
}
