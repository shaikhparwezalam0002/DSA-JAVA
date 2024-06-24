public class CheckSortArray{

    public static boolean checkSort(int[] arr,int i){
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSort(arr, i+1);


    }
    public static void main(String[] args) {
        int arr[]={1,2,10,4,5};
        System.out.println(checkSort(arr,0));
    }
}
