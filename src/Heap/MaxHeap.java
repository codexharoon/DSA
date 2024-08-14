package Heap;

public class MaxHeap {
    private int [] items;
    private int size;

    public MaxHeap(int size){
        this.items = new int [size];
        this.size = 0;
    }


    private int getParentIndex(int index){
        return (index - 1) / 2;
    }


    private int getParent(int index){
        return items[getParentIndex(index)];
    }

    private void swapItem(int index1 , int index2){
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    public void insert(int value){
        items[size] = value;
        size++;

        // bubble up
        int index = size - 1;
        while(index > 0 && items[index] > getParent(index)){
            // swap
            swapItem(index,getParentIndex(index));

            index = getParentIndex(index);
        }
    }
}
