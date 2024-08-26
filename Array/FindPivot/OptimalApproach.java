public class FindPivot {
    public static int findPivot(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,0};
        int idx=findPivot(arr);
        System.out.println(idx);
    }
}
