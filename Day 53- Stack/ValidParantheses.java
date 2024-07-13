//20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                //push it into stack
                stack.push(ch);
            }
            else if((ch=='}' || ch==']' || ch==')')) {
                if(stack.isEmpty() ){
                    return false;
                }
                char op=stack.peek();
                if(ch=='}' && op=='{') {
                    stack.pop();
                    
                }
                else if(ch==']' && op=='[' ){
                    stack.pop();
                    
                }
                else if(ch==')' && op=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (stack.isEmpty())? true : false;
        
    }
}
