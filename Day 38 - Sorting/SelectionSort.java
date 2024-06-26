public class SelectionSort{
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){ 
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={5,2,3,7};
        SelectionSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}