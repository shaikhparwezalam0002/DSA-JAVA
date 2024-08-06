//Frequencies of Limited Range Array Elements - gfg

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            max=Math.max(max,arr[i]);
        }
        int len=Math.max(max+1,arr.length);
        int[] freq=new int[len];
        for(int i=0;i<N;i++){
            freq[arr[i]-1]++;
        }
        for(int i=0;i<N;i++){
            arr[i]=freq[i];
        }
    }
}
