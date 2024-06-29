

public class FindSubSet{
    public static void findSubSet(String str,int i, String ans){
        if(str.length()==i){
            if(ans.length()==0){
                System.out.println("Null");
                return;
            }
            System.out.println(ans);
            return;
        }
        //for yes
        findSubSet(str, i+1, ans+str.charAt(i));
        //for no
        findSubSet(str, i+1, ans);
    }
    public static void main(String[] args) {
        findSubSet("abcd",0,"");
    }
}