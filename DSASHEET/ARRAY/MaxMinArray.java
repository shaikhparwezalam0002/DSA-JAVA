//Q: Maximum and Minimum Element in an Array - GFG
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            min=Math.min(min,A[i]);
        }
        return N=min+max;
    }
}

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    n=findSum(arr,n);
    System.out.println(n);
  }
}
