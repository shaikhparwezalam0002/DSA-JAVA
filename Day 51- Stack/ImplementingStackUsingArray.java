//Implement stack using array

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(top<1000){
            top++;
            arr[top]=x;
        }
    }

    public int pop() {
        // Your Code
        if(top>-1){
            int pop=arr[top];
            top--;
            return pop;
        }
        return -1;
        
    }
}
