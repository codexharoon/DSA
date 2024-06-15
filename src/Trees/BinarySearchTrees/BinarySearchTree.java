package Trees.BinarySearchTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    private boolean checkEquality(Node r1,Node r2){
        if(r1 == null && r2 == null) return true;

        if(r1 == null) return false;
        if(r2 == null) return false;

        return r1.data == r2.data && checkEquality(r1.left,r2.left) && checkEquality(r1.right,r2.right);
    }

    private void NodesAtK(Node root, int k, List<Integer> res){
        if(root == null) return;
        if(k == 0 ) {
            res.add(root.data);
            return;
        }

        NodesAtK(root.left,k-1,res);
        NodesAtK(root.right,k-1,res);
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

    public boolean checkEquality(BinarySearchTree r2){
        return checkEquality(root,r2.root);
    }

    public List<Integer> NodesAtK(int k ){
        List<Integer> res = new ArrayList<>();
        NodesAtK(root,k,res);

        return res;
    }

    public List<List<Integer>> levelOrderTraversal(){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new LinkedList<>();

            for(int i=0; i<size; i++){
                Node node = q.poll();
                temp.add(node.data);

                if(node.left != null ) q.add(node.left);
                if(node.right != null ) q.add(node.right);
            }

            list.add(temp);
        }

        return list;
    }

}
