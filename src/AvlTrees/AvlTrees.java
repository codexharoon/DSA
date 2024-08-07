package AvlTrees;

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int value){
        this.data = value;
        left = null;
        right = null;
    }

    public String toString(){
        return "Data = "+data;
    }
}
public class AvlTrees {
    private Node root;

    private Node insert(Node root,int value){
            if(root == null) return new Node(value);

            if(value == root.data) return root;

            if(value < root.data){
                root.left = insert(root.left,value);
            }
            else{
                root.right = insert(root.right,value);
            }

            return root;
    }

    public void insert(int value){
        root = insert(root,value);
    }
}
