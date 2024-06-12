
public class LargestString{
    public static String printLargestString(String[] arr){
        String longString=arr[0];
        for(int i=1;i<arr.length;i++){
            String st=arr[i];
            if(longString.compareTo(st)<0){
                longString=st;
            }
        }
        return longString;
    }
    public static void main(String[] args) {
        String[] str={"apple","banana","mango"};
        System.out.println(printLargestString(str));
    }
}