import java.util.*;
public class RotateKTime{
    public static int containsTarget(int arr[], int target){
        if(target>=arr.length || arr.length<=1 ){
            if(arr.length==1 && target==arr[0]){
                return arr[0];
            }
            else{
                return -1;
            }
        }
        boolean flag= false;
        int[] dup=new int[arr.length];
        int j=target,i=0;
        while(j<arr.length){
            dup[i]=arr[j];
            
            if(arr[j]==target){
                flag=true;
            }
            i++;
            j++;
        }

        for(j=0; j<target;j++){
            dup[i]=arr[j];
            
            if(arr[j]==target){
                flag=true;
            }
            i++;
        }
        arr=dup;
        if(flag){
            return arr[target];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(containsTarget(nums,target));
    }
}