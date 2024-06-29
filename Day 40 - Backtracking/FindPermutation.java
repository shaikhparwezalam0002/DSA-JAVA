public class FindPermutation{
    public static void printPermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            printPermutation(s, ans+c);
        }
    }
    public static void main(String[] args) {
        printPermutation("abc","");
    }
}