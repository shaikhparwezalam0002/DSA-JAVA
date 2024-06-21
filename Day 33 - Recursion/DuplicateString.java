public class DuplicateString{
    static StringBuilder sb=new StringBuilder();
    public static String removeDuplicate(String s,int len){
        
        if(len==s.length()){
            return null;
        }
        char ch=s.charAt(len);
        if(sb.indexOf(String.valueOf(ch))==-1){
            sb.append(ch);
        }
        removeDuplicate(s, len+1);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("apnacollege",0));
    }
}