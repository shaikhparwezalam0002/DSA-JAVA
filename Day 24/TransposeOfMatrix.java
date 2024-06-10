import java.util.Scanner;
public class TransposeOfMatrix{
    public static void transposeMatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] trans=new int[m][n];
        //System.out.println(m+""+n);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i]=arr[i][j];
            }
            //System.out.println("");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
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
        
        transposeMatrix(matrix);
        
    }
}
