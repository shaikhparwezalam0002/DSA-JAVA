//Intersection of two arrays
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> unq=new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++){
            unq.add(a[i]);
        }
        for(int j=0;j<m;j++){
            if(unq.contains(b[j])){
                ++c;
                unq.remove(b[j]);
            }
        }
        return c;
    }
};
