package AvlTrees;

public class Main {
    public static void main(String[] args){
        AvlTrees avlTree = new AvlTrees();

        int [] items = new int[]{10,15,20};
//        int [] items = new int[]{8,4,10,6,2,9};

        for(int i=0; i<items.length; i++){
            avlTree.insert(items[i]);
        }

        System.out.println(avlTree);
    }
}
