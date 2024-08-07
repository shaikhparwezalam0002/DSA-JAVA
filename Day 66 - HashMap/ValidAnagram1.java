//242. Valid Anagram - Brute Force
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> freqMap=new HashMap<>();
        HashMap<Character,Integer> freqMap1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freqMap.containsKey(ch)){
                freqMap.put(ch,freqMap.get(ch)+1);
            }
            else{
                freqMap.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(freqMap1.containsKey(ch)){
                freqMap1.put(ch,freqMap1.get(ch)+1);
            }
            else{
                freqMap1.put(ch,1);
            }
        }
        Set<Character> keys=freqMap.keySet();
        for(Character itr : keys ){
            if(freqMap1.get(itr)==null){
                return false;
            }
            int c=freqMap1.get(itr);
            int c1=freqMap.get(itr);
            if(c!=c1){
                return false;
            }
            
        }
        return true;
    }
}
