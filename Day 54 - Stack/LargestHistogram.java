
//https://leetcode.com/problems/largest-rectangle-in-histogram/description/ - leetcode
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int[] right=smallRightMost(arr);
        int[] left=smallLeftMost(arr);
        for(int i=0;i<arr.length;i++){
            int area=arr[i] * (right[i]-left[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
    public static int[] smallRightMost(int[] arr){
        int[] next=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!stack.isEmpty() && curr<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=arr.length;
            }
            else{
                next[i]=stack.peek();
            }
            stack.push(i);
        }
        return next;
    }
     public static int[] smallLeftMost(int[] arr){
        int[] next=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!stack.isEmpty() && curr<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=-1;
            }
            else{
                next[i]=stack.peek();
            }
            stack.push(i);
        }
        return next;
     }
}
