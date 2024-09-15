package Tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public Node[] getChildren(){
        return children.values().toArray(new Node[0]);
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


    private Node getLastNode(Node root,String prefix,int index){
        if(index == prefix.length()){
            return root;
        }

        return getLastNode(root.getChild(prefix.charAt(index)),prefix,index + 1);
    }

    private void searchForChildren(Node root,String prefix,List<String> result){
        if(root == null) return;
        if(root.isEndOfWord) result.add(prefix);

        for(Node child : root.getChildren()){
            searchForChildren(child,prefix+child.value,result);
        }
    }

    public List<String> autoComplete(String prefix){
        List<String> result = new ArrayList<>();

        Node startingPoint = getLastNode(root,prefix,0);

        searchForChildren(startingPoint,prefix,result);
        return result;
    }
}
