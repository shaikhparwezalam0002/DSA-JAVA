/*
1. Trie creation
2. Insertion
3. Search
4. Check preFix character
5. word break
6. prefix String
*/
public class Insertion {
    static class Node{
        boolean endOfWord=false;
        Node[] childNode=new Node[26];
        int charFreq;
        public Node(){
            for(int i=0;i<childNode.length;i++){
                childNode[i]=null;
            }
            charFreq=1;
        }
    }
    public static Node root=new Node();
    public static void inserTrie(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            if(curr.childNode[idx]==null){
                curr.childNode[idx]=new Node();
            }
            else{
                curr.childNode[idx].charFreq++;
            }
            curr=curr.childNode[idx];
        }
        curr.endOfWord=true;
    }
    public static void preFixChar(Node root,String word){
        if(root==null){
            return;
        }
        if(root.charFreq==1){
            System.out.println(word);
            return; 
        }
        for(int i=0;i<root.childNode.length;i++){
            //int idx=word.charAt(i)-'a';
            if(root.childNode[i]!=null){
                preFixChar(root.childNode[i],word+(char)(i+'a'));
            }
        }
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            //System.out.println(idx+" char val = "+key.charAt(i));
            if(curr.childNode[idx]==null){
                return false;
            }
            System.out.println((char)(idx+'a')+" "+curr.childNode[idx].charFreq);
            //System.err.println();
            curr=curr.childNode[idx];
        }
        return curr.endOfWord==true;
    }
    public static boolean wordBreak(String word){
        if(word.length()<=0){
            return true;
        }
        for(int i=1;i<word.length();i++){
            if( search(word.substring(0, i)) && wordBreak(word.substring(i)) ){
                return true;
            }
        }
        return false;
    }
    public static boolean preFix(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.childNode[idx]==null){
                return false;
            }
            curr=curr.childNode[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"trie","startswith"};
        for(int i=0;i<words.length;i++){
            inserTrie(words[i]);
        }
        //System.out.println(search("mango"));
        root.charFreq=-1;
        //preFixChar(root,"");
        System.out.println(preFix("a"));
    }
}
