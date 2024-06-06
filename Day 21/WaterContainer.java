
//Brute force approach
import java.util.Scanner;
public class WaterContainer{
    public static int calculateArea(int height[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int dst=Math.abs(i-j);
                int ht=Math.min(height[i],height[j]);
                int area=dst * ht;
                max=Math.max(area,max);
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