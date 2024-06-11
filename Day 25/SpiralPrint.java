import java.util.Scanner;
public class SpiralPrint{
    public static void returSpiralSum(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int col_st=0;
        int col_end=m-1;
        int row_st=0;
        int row_end=n-1;
        while (row_st<=row_end && col_st<=col_end) { 
            //column start
            for(int i=col_st;i<=col_end;i++){
                System.out.print(arr[row_st][i]+" ");
            }
            //System.out.println("");
            //end row
            for(int i=row_st+1;i<=row_end;i++){
                System.out.print(arr[i][col_end]+" ");
            }
            //System.out.println("");
            //lower column  
            for(int i= col_end-1;i>=col_st;i--){
                 if( row_st == row_end){
                         break;
                  }
                System.out.print(arr[row_end][i]+" ");
            }
            //System.out.println("");
            //upper col
            for(int i= row_end-1;i>row_st;i--){
                if(col_st == col_end){
                         break;
                  }
                System.out.print(arr[i][row_st]+" ");
            }
            row_st++;
            row_end--;
            col_end--;
            col_st++;
            //System.out.println("");

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        returSpiralSum(arr);
    }
}
