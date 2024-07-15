
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        
        long[] next=new long[n];
        // Your code here
        if(arr.length==1){
            next[0]=-1;
            return next;
        }
        Stack<Long> stack=new Stack<>();
        stack.push(arr[n-1]);
        next[n-1]=-1;
        for(int i=n-2; i>=0;i--){
            long curr=arr[i];
            while(!stack.isEmpty() && curr>=stack.peek() ){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        
        return next;
    } 
}
