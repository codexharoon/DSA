package Trees.BinarySearchTrees;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

    public String toString(){
        return "data = "+data;
    }
}
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    private Node insert(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value <= root.data){
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
