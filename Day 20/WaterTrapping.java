//brute force approach Water Trapping question.
import java.util.Scanner;
public class WaterTrapping{
    public static void waterTrap(int[] arr){
        int[] leftMost=new int[arr.length];
        int[] ritMost=new int[arr.length];
        leftMost[0]=arr[0];
        ritMost[arr.length-1]=arr[arr.length-1];
        int waterTap=0;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            while(j>=0){
                leftMost[i]=Math.max(arr[j],leftMost[i]);
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                ritMost[i]=Math.max(arr[j],ritMost[i]);
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            int cs=Math.min(leftMost[i],ritMost[i])-arr[i];
            waterTap+=(cs>0)?cs:0;
        }
        System.out.println("Water Tapped :"+waterTap);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        waterTrap(arr);
    }
}
