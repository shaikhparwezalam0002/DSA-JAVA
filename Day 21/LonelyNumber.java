
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LonelyNumber{
    public static void findLonelyNumber(int[] nums){
        ArrayList<Integer> al=new ArrayList<Integer>();
        Arrays.sort(nums);
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length ; j++){
                if((nums[i]==nums[j] || nums[i]+1==nums[j]|| nums[i]-1==nums[j] )&&i!=j){
                    flag=1;
                }
            }
            if(flag!=1){
                al.add(nums[i]);
            }
            else{
                flag=0;
            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        findLonelyNumber(nums);
    }
}