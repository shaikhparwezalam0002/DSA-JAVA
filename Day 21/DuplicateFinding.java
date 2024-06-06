import java.util.*;
public class DuplicateFinding{
    public static boolean findDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        boolean b=findDuplicate(arr);
        System.out.println(b);
    }
}