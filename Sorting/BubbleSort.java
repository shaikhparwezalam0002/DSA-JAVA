public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,42,45,12,1};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
