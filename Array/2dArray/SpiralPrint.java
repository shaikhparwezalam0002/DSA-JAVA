public class Main{
    public static void main (String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        
        int startRow=0;
        int endRow=arr[0].length-1;
        int startCol=0;
        int endCol=arr.length-1;
       while(startRow<=endRow && startCol <= endCol){
            
            //top 
            for(int i=startRow;i<=endRow;i++){
                System.out.print(arr[startRow][i]+" ");
            }
            
            //endcol 
            for(int i=startCol+1;i<=endCol;i++){
                System.out.print(arr[i][endRow]+" ");
            }
            
            for(int i=endRow-1;i>=startRow;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[endCol][i]+" ");
            }
            
            for(int i=endCol-1;i>startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            
            startRow++;
            endRow--;
            endCol--;
            startCol++;
        }
    }
}
