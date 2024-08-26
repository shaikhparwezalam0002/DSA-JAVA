public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){ //0 to n-2
            int idx=i;
            for(int j=i+1;j<n;j++){ //0 to n-1
                if(arr[idx] > arr[j]){
                    idx=j;
                }
            }
            if(idx!=i){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,42,45,12,1};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
