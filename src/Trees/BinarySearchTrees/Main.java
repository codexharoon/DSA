package Trees.BinarySearchTrees;

public class Main {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(7);
        bst.insert(8);
        bst.insert(1);
        bst.insert(3);
        bst.insert(2);
        bst.insert(5);
        bst.insert(10);

        System.out.println(bst.find(10));

        System.out.println("-----------------------------");

        BinarySearchTree t = new BinarySearchTree();
        int [] items = new int[] {12,4,14,1,8,13,15};

        for(int i : items){
            t.insert(i);
        }

        System.out.println("Pre Order: ");
        t.preOrderTraversal();
        System.out.println();

        System.out.println("In Order: ");
        t.inOrderTraversal();

    }
}
