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

    private boolean isLeftHeavy(Node root){
        if(root == null) return false;

        int bf = getBalanceFactor(root);
        return bf > 1;
    }


    private boolean isRightHeavy(Node root){
        if(root == null) return false;

        int bf = getBalanceFactor(root);
        return bf < -1;
    }


    private Node leftRotation(Node root){
        if(root == null) return null;

        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;

        return newRoot;
    }


    private Node rightRotation(Node root){
        if(root == null) return null;

        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;

        return newRoot;
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
//                System.out.println("Imbalance at node = " + root.data);

                if(isLeftHeavy(root)){

                    if(getBalanceFactor(root.left) < 0){
//                    System.out.println("Do left rotation! at node "+root.left.data);
                        root.left = leftRotation(root.left);
                    }

//                    System.out.println("Do right rotation! at node "+root.data);
                    root = rightRotation(root);
                }
                else if(isRightHeavy(root)){

                    if(getBalanceFactor(root.right) > 0){
//                    System.out.println("Do right rotation! at node "+root.right.data);
                       root.right = rightRotation(root.right);
                    }

//                    System.out.println("Do left rotation! at node "+root.data);
                    root = leftRotation(root);
                }
            }


            return root;
    }

    public void insert(int value){
        root = insert(root,value);
    }
}
