import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		int max=Integer.MIN_VALUE;	
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				sum+=arr[j];
				max=Math.max(max,sum);
			}
			sum=0;
		}
		return max>0 ?max: 0;
	}

}
