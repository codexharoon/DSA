package AvlTrees;

class Node{
    public int data;
    public Node left;
    public Node right;
    public int height;

    public Node(int value){
        this.data = value;
        left = null;
        right = null;
        height = 0;
    }

    public String toString(){
        return "Data = "+data;
    }
}
public class AvlTrees {
    private Node root;


    private int getHeight(Node root){
        if(root == null) return -1;

        return root.height;
    }

//    H(l) - H(r)
    private int getBalanceFactor(Node root){
        if(root == null) return 0;

        return getHeight(root.left) - getHeight(root.right);
    }


    private boolean isBalanced(Node root){
        if(root == null) return true;

        int bf = getBalanceFactor(root);

        return bf >= -1 && bf <= 1;
    }

    private Node insert(Node root,int value){
            if(root == null) return new Node(value);

            if(value == root.data) return root;

            if(value < root.data){
                root.left = insert(root.left,value);
            }
            else{
                root.right = insert(root.right,value);
            }

            root.height = Math.max(getHeight(root.left),getHeight(root.right)) + 1;

            if(!isBalanced(root)){
                System.out.println("Imbalance at node = " + root.data);
            }


            return root;
    }

    public void insert(int value){
        root = insert(root,value);
    }
}
