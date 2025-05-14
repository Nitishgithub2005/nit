package tries;

import java.util.Arrays;
import java.util.List;

class TrieNode{
    TrieNode[] childern;
    boolean wordEnd;
    TrieNode(){
        wordEnd=false;
        childern=new TrieNode[26];//Alphabets a to z or A to Z
    }
}
public class Tries {
    //insert function
    static void insert(TrieNode root,String word){
        TrieNode curr=root;
        for (char c:word.toCharArray()){
            if(curr.childern[c-'a']==null){
                //null means node is not present
                //So, we create a node of that character
                curr.childern[c - 'a']=new TrieNode();
            }
            //Move to the children node for the next character
            curr=curr.childern[c - 'a'];
        }
        curr.wordEnd=true;
    }
    static boolean search(TrieNode root,String word){
        TrieNode curr= root;
        for(char c : word.toCharArray()){
            if(curr.childern[c-'a']==null){
                //node is not present in the Trie,return false
                return false;
            }
            curr=curr.childern[c-'a'];

        }
        return curr.wordEnd;
    }

    public static void main(String[] args) {
        TrieNode root= new TrieNode();
        List<String> inputWords= Arrays.asList("pooja","jeevika","nitish","rama");
        for (String word :inputWords){
            insert(root,word);
        }
        List<String> seearhWords=Arrays.asList("pooja","nirmal","jeevika","arun","Nitish","rama","anup");
        for (String word:seearhWords){
            if(search(root,word)){
                System.out.println(word +  " is present");
            }
            else{
                System.out.println(word+" is not present");
            }
        }
    }
}
