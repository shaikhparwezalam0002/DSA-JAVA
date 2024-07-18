import java.util.*;
public class DQ{
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();

        dq.addFirst(10);//[10]
        dq.addFirst(20);//[20,10]
        dq.addLast(30);//[20,10,30]
        dq.addLast(40);//[20,10,30,40]
        System.out.println(dq);
        // System.out.println("remove last "+dq.removeLast());
        // System.out.println("remove last "+dq.removeFirst());
        // System.out.println("get first "+dq.getFirst());
        // System.out.println("get last "+dq.getLast());
        while(!dq.isEmpty()){
            System.out.println(dq.removeLast());
        }
        
    }
}
