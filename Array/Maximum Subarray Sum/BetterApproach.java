import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		int max=Integer.MIN_VALUE;
		int[] prefix=new int[n];
		int sum=0;
		prefix[0]=arr[0];  //
		for(int i=1;i<n;i++){
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int i=0;i<n;i++){
			max=Math.max(max,prefix[i]);
		}

		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				sum=i==0 ? prefix[i]:prefix[j]-prefix[i];
				max=Math.max(sum,max);
			}
		}
		return max;
	}

}
