
class Solution {
    public int binarysearch(int[] arr, int k) {
       int i=0;
       int j=arr.length-1;
       int mid;
       while(i<=j){
           mid=(i+j)/2;
           if(arr[mid]==k){
               return mid;
           }
           else if(arr[mid]<k){
              i=mid+1;
           }
           else{
               j=mid-1;
           }
       }
       return -1;
    }
}
