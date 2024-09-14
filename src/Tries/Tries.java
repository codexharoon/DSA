package Tries;

import java.util.HashMap;
import java.util.Map;

class Node {
    public char value;
    private Map<Character,Node> children;
    public boolean isEndOfWord;


    public Node(char value){
        this.value  = value;
        children = new HashMap<>();
        isEndOfWord = false;
    }

    public boolean hasChild(char ch){
        return children.containsKey(ch);
    }

    public void insetChild(char ch){
        children.put(ch,new Node(ch));
    }

    public Node getChild(char ch){
        return children.get(ch);
    }

    public String toString(){
        return ""+this.value;
    }
}
public class Tries {
    Node root;

    public Tries(){
        this.root = new Node(' ');
    }

    public void insert(String word){
        Node c = root;

        for(char ch : word.toCharArray()){

            if(!c.hasChild(ch)){
                c.insetChild(ch);
            }

            c = c.getChild(ch);
        }

        c.isEndOfWord = true;
    }
}
