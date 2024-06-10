
import java.util.Scanner;

//Print the number of 7’s that are inthe 2d array.
public class Print7s{
    public static int countOf7(int[][] arr,int key){
        int j=0,count=0;
        //System.out.println(arr.length);
        for (int[] arr1 : arr) {
            while (j<arr[0].length) {
                if (arr1[j] == key) {
                    count++;
                    //System.out.print(arr[row][j]+" ");
                }
                j++;
            }
            //System.out.println("");
            j=0;
        }
        //System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entery the key");
        int key=sc.nextInt();
        
        System.out.println(countOf7(matrix,key));
    }
}