public class FindMiddle { //O(n)
    public static int  findMid(int[] arr){
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                return i;
            }
        }
        if(arr[n-1]< arr[0]){
            return n-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0};
        int idx=findMid(arr);
        System.out.println(idx);
    }
}
