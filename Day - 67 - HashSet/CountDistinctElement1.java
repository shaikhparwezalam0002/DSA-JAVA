import java.util.*;
public class CountDistinctElement {
    public static int countDistinct(int[] arr){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        
        return set.size();
    }
    public static void main(String[] args) {
       int count= countDistinct(new int[]{1,3,4,5,2,3,6,7,8,3});
       System.out.print(count);
    }
}
