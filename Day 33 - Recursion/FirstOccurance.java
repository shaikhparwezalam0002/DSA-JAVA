public class FirstOccurance{
    public static int firstOccurance(int[] arr,int i,int k){
        if(i==arr.length-1){
            if(arr[i]==k){
                return i;
            }
            else{
                return -1;
            }
        }
        if(i<arr.length && arr[i]==k){
            return i;
        }
        return firstOccurance(arr, i+1, k);
    }
    public static void main(String[] args) {
       // int arr[]={8,1,3,2,6,2,7,2,8,3};
        int arr[]={1};
        int key=2;
        System.out.println(firstOccurance(arr,0,key));
    }
}