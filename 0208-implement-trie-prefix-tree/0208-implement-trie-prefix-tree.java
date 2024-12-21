import java.util.*;
class Trie {
    private TrieNode root;
    class TrieNode{
        private TrieNode[] children;
        private boolean isEndOfWord;
        public TrieNode(){
            children = new TrieNode[26];
            isEndOfWord=false;
        }
    }
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }
    
    private TrieNode searchNode(String str){
        TrieNode curr = root;
        for(char ch : str.toCharArray()){
            int idx = ch-'a';
            if(curr.children[idx]==null){
                return null;
            }
            curr = curr.children[idx];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */