//optimise solution
import java.util.Scanner;
public class WaterContainer1{
    public static int calculateArea(int height[]){
        int max=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int dt= Math.abs(i-j);
            int area=dt*ht;
            max=Math.max(area,max);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(calculateArea(nums));
    }
}
