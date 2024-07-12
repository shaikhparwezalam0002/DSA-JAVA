
import java.util.Stack;
//Next Greater Element -gfg
public class NextGreaterElement{
    public static void nextBigElement(int arr[]){
        Stack<Integer> stack=new Stack<>();
        int[] next =new int[arr.length];
        stack.push(arr[arr.length-1]);
        next[arr.length-1]=-1;
       // int j=1;
        for(int i=arr.length-2;i>=0;i--){
            int curr=arr[i];
            while(!stack.isEmpty() && curr >stack.peek() ){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=stack.peek();
            }
           // j++;
            stack.push(arr[i]);
        }

        for(int i : next){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        nextBigElement(arr);
    }
}
