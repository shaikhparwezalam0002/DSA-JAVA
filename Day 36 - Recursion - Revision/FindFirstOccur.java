public class FindFirstOccur{
    public static int findFirstOccurance(int[] arr,int key,int i){

        if((arr.length-1)==i){
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
        return findFirstOccurance(arr,key,i+1);

    }
    public static void main(String[] args) {
        int[] arr={8,3,6,9,5,10,2,5,3};
        System.out.println(findFirstOccurance(arr,5,0));
    }
}