import java.util.Stack;
public class QueueUsingStack{

    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2 =new Stack<>();  

    public boolean isEmpty(){
        return st1.isEmpty();
    }
    public void add(int data){
        if(isEmpty()){
            st1.push(data);
        }
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
            st1.push(data);
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return st1.pop();
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return st1.peek();
        }
    }
}
