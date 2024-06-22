public class LinearSearch{
    public static void findingKey(int[] arr,int i,int k){
        if(i<0){
            return;
        }
        findingKey(arr, i-1, k);
        if(arr[i]==k){
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,5,2,5,3,2};
        findingKey(arr,arr.length-1,2);
    }
}
