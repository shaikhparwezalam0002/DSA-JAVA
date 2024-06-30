
import java.util.Scanner;

public class NQueens{
    static int count=0;
    public static boolean isSafe(char[][] board,int row,int col){
        //vortically up 
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens(char[][] board,int row){
        if(row==board.length){
            // printQueens(board);
            //count++;
            return true;
        }

        for(int i=0;i<board[0].length;i++){
            boolean yes=isSafe(board,row,i);
            if(yes){
                board[row][i]='Q';
                if(nQueens(board,row+1)){
                    return true;
                }
                board[row][i]='X';
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++) {
            for(int j = 0; j<board[0].length; j++) {
                board[i][j]='X';
            }
            //System.out.println("");
        }
        
        if (nQueens(board,0)) {
            printQueens(board);
            return ;
        }
        System.out.println("Total count is "+count);
    }
    public static void printQueens(char board[][]){
        System.out.println("-----------Chess Board-----------");
        for (char[] board1 : board) {
            for (int j = 0; j<board[0].length; j++) {
                System.out.print(board1[j]+" ");
            }
            System.out.println("");
        }
    }
}
