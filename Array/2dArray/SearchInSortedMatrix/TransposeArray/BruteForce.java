public class Main{
    public static void transposeArray(int[][] arr){
        int[][] trans=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[j][i]=arr[i][j];
            }
        }
        
        for(int[] temp : trans){
            for(int i : temp){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45}
        };
        transposeArray(arr);
    }
}
