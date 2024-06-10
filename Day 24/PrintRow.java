import java.util.Scanner;
public class PrintRow{
    public static int rowNumPrint(int[][] arr,int row) {
        int sum=0;
        for(int i=0;i<arr[0].length;i++){
            sum+=arr[row][i];
        }
        return sum;
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
        System.out.println("Entery the row no.");
        int rowNum=sc.nextInt();
        System.out.println(rowNumPrint(matrix,rowNum-1));
    }
}