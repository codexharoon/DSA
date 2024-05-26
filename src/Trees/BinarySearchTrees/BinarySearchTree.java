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

    private int dept(Node root,int value,int dept){
        if(root == null) return -1;

        if(root.data == value) return dept;
        else if(value <= root.data) return dept(root.left,value,dept + 1);
        else return dept(root.right,value,dept+1);
    }

    private int getHeightOfTree(Node root){
        if(root == null) return -1;

        if(root.left == null && root.right == null) return 0;

        return Math.max(getHeightOfTree(root.left),getHeightOfTree(root.right)) + 1;
    }

    private int getHeightOfTreeNode(Node root,int value){
        if(root == null) return -1;

        if(root.data == value) return getHeightOfTree(root);
        else if(value <= root.data) return getHeightOfTreeNode(root.left,value);
        else return getHeightOfTreeNode(root.right,value);
    }

    private Node getMin(Node root){
        if(root == null) return null;

        if(root.left == null) return root;

        return getMin(root.left);


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

    public int getDept(int value){
        return dept(root,value,0);
    }

    public int getHeight(){
        return getHeightOfTree(root);
    }

    public int getNodeHeight(int value){
        return getHeightOfTreeNode(root,value);
    }

    public Node getMin(){
        return getMin(root);
    }

}
