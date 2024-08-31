public class Main{
    public static void transposeArray(int[][] arr){
        if(arr.length!=arr[0].length){
            System.out.print("Transpose not possible");
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int[] temp : arr){
            for(int i : temp){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int[][] arr={
            {10,20},
            {15,25}
        };
        transposeArray(arr);
    }
}
