public class SortedArray{
    public static boolean isSorted(int arr[], int i){
        if(arr.length-1==i){
            return true;
        }
        if(i<arr.length-1 && arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={9,2};
        boolean b=isSorted(arr,0);
        System.out.println(b);
    }
}
