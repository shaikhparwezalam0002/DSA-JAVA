//backtrack on arrays.
public class ArraysBackTrack{
    public static void backTrackArray(int n,int arr[]){
        if(n==0){
            arr[n]=n+1;
            printArray(arr);
            arr[n]=arr[n]-2;
            return;
        }
        arr[n]=n+1;
        backTrackArray(n-1,arr);
        arr[n]=arr[n]-2;
        
    }
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        backTrackArray(4,arr);
        printArray(arr);
        
    }
}
