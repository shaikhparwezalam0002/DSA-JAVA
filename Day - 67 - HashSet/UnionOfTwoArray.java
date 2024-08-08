//Union of Two Sorted Arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        for(Integer itr : set){
            list.add(itr);
        }
        Collections.sort(list);
        return list;
    }
}
