public class Main{
    public static void search2dMatrix(int[][] arr,int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[row].length){
            if(arr[row][col]==key){
                System.out.print("Found");
                return;
            }
            else if(key<arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.print("Not Found");
    }
    public static void main (String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search2dMatrix(arr,500);
    }
}
