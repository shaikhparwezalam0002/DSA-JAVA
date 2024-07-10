//Implement Stack using Linked List -GFG


class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode n=new StackNode(a);
        // Add your code here
        if(top==null){
            top=n;
            return;
        }
        n.next=top;
        top=n;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top!=null){
            int ele=top.data;
            top=top.next;
            return ele;
        }
        return -1;
    }
}
