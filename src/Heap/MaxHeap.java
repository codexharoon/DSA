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


    private void heapify( int i){
        int largest = i;

        int lci = i * 2 + 1;
        int rci = i * 2 + 2;

        if(lci < size && items[lci] > items[largest] ){
            largest = lci;
        }
        if(rci < size && items[rci] > items[largest] ){
            largest = rci;
        }

        if(largest == i) return;

        swapItem(largest,i);

        heapify(largest);
    }

    public int remove(){
        if(this.size == 0) return -1;
        int removedItem = items[0];

        items[0] = items[size - 1];
        items[size - 1] = 0;
        size--;

        heapify(0);

        return removedItem;
    }
}
