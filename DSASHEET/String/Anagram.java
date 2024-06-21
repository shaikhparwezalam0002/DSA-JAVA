//242. Valid Anagram
class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] ss=new char[s.length()];
        char[] tt=new char[t.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ss[i]=c;
            c=t.charAt(i);
            tt[i]=c;
        }
        Arrays.sort(ss);
        Arrays.sort(tt);
        s=String.valueOf(ss);
        t=String.valueOf(tt);
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }

    }
}
