//155. Min Stack- leetcode
class MinStack {
     Stack<Integer> s=new Stack<>();
     Stack<Integer> min=new Stack<>();
    public MinStack() {
       
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(val);
            min.push(val);
            return;
        }
        else{
            if(min.isEmpty()){
                min.push(val);
                s.push(val);
            }
            else if(min.peek()>=val){
                min.push(val);
                s.push(val);
            }
            else{
                s.push(val);
            }
        }
       
    }
    
    public void pop() {
        int m=s.pop();
        if(m==min.peek()){
            min.pop();
        }
        return;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
