public class Main{
    public static void search2dMatrix(int[][] arr,int key){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int startRow=0;
            int endRow=m-1;
            while(startRow<=endRow){
                int mid=(startRow+endRow)/2;
                if(arr[i][mid]==key){
                    System.out.print("Found at "+i+" , "+mid);
                    return;
                }
                else if(arr[i][mid]<key){
                    startRow=mid+1;
                }
                else{
                    endRow=mid-1;
                }
            }
        }
        System.out.print("Not Found");
        return;
    }
    public static void main (String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search2dMatrix(arr,40);
    }
}
