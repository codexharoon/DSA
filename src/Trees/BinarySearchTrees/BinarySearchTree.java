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

    private int find(Node root,int value){
        if(root == null) return -1;

        if(value == root.data) return 1;
        else if(value <= root.data){
            return find(root.left,value);
        }
        else {
            return find(root.right, value);
        }
    }


    private void preOrderTraversal(Node root){
        if(root == null) return;

        // root, left, right
        System.out.print(root.data + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void inOrderTraversal(Node root){
        if(root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    private void postOrderTraversal(Node root){
        if(root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+ " ");
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public int find(int value){
        return find(root,value);
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
    }


}
