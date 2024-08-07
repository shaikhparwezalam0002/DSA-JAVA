class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // Using HashMap
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=1;i<=N;i++){
           arr[i-1]=0;
           if(map.containsKey(i)){
               arr[i-1]=map.get(i);
           }
        }
    }
}
