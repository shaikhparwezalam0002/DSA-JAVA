public class Main
{
	public static void main(String[] args) {
		String s="rohit";
		String s1="ohitr";
	    for(int i=0;i<s.length();i++){
	        Character ch=s.charAt(i);
	        if(s1.contains(ch.toString())){
	            s1=s1.replace(ch.toString(),"");
	        }
	    }
	    if(s1.length()>0){
	        System.out.print("Not an Anagram");
	    }
	    else{
	        System.out.print("Anagram");
	    }
	}
}
