//First non-repeating character in a stream - gfg

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Character> q=new LinkedList<>();
        int[] freq=new int[26];
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                sb.append("#");
            }
            else{
               // System.out.print(q.peek()+" ");
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
}
