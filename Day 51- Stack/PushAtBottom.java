
import java.util.Stack;

public class PushBottom{
    public static void pushAtBottom(int data,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        Integer ele= stack.pop();
        pushAtBottom(data,stack);
        stack.push(ele);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        pushAtBottom(10,stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
