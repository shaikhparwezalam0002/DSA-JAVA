//Insert and Search in a Trie
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode curr=root;
    for(int i=0;i<key.length();i++){
        int idx=key.charAt(i) - 'a';
        if(curr.children[idx]==null){
            curr.children[idx]=new TrieNode();
        }
        curr=curr.children[idx];
    }
    curr.isEndOfWord=true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode curr=root;
    for(int i=0;i<key.length();i++){
        int idx=key.charAt(i)-'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr=curr.children[idx];
    }
    return curr.isEndOfWord==true;
}
