public class Main{
    public static void search2dMatrix(int[][] arr,int key){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    System.out.print("Found ");
                    return ;
                }
            }
        }
        System.out.print("Not Found");
        return ;
    }
    public static void main (String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search2dMatrix(arr,45);
    }
}
