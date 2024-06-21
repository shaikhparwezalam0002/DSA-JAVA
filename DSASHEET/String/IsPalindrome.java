//125. Valid Palindrome
class IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));
            if( (c>=97 && c<=122) || (c>=48 && c<=57)  )
                sb.append(c);
        }
        s= sb.toString();
        String rev=sb.reverse().toString();
        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
