public class FindLastOccurance{
    public static int findLastOccurance(int[] arr,int key,int i){

        if(i==0){
            if(arr[i]==key){
                return i;
            }
            else{
                return -1;
            }
        }
        if(arr[i]==key){
            return i;
        }
        return findLastOccurance(arr,key,i-1);
        

    }
    public static void main(String[] args) {
        int[] arr={8,3,6,9,5,10,2,5,3};
        System.out.println(findLastOccurance(arr,5,8));
    }
}